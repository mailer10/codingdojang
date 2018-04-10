package num3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LCDDisplay {

	public static char[][][] printArray(char[][][] array, int[][] numberArray){
		
		for(int k=0; k< numberArray.length; k++){
			
			while(numberArray[k][1] != 0){
				
				int d = numberArray[k][1] % 10;
				
				numberArray[k][1] /= 10;
				
				switch(d){
				
					case 1 :
						
						for(int i = 1; i< array[k][0].length-1; i++){
							array[k][0][i] = '-';
						}
						
						break;
				
					case 2 :
						
						for(int i = 1; i < array[k].length/2; i++){
							array[k][i][0] = '|';
						}
						
						break;
						
					case 3 :
						
						for(int i = 1; i < array[k].length/2; i++){
	
							array[k][i][array[k][0].length-1] = '|';
						}
						break;
						
					case 4 :
						
						for(int i = 1; i< array[k][0].length-1; i++){
							array[k][array[k].length/2][i] = '-';
						}
						
						break;
						
					case 5 :
						for(int i = array[k].length/2+1; i < array[k].length - 1; i++){
							array[k][i][0] = '|';
						}
						break;
						
					case 6 :
						for(int i =array[k].length/2+1; i < array[k].length - 1; i++){
							array[k][i][array[k][0].length-1] = '|';
						}
						break;
						
					case 7 :
						
						for(int i = 1; i< array[k][0].length-1; i++){
							array[k][array[k].length-1][i] = '-';
						}
						
						break;
			
				}
				
			}
			
			
		}
		
		
		
		
		return array; 
		
	}
	
	
	public static void execute(List testCase){
		
		for(int i=0; i<testCase.size(); i++){
			
			String inputNumber = (String) testCase.get(i);
			
			StringTokenizer stn = new StringTokenizer(inputNumber, " ");
			
			String sString = stn.nextToken();
			
			String nString = stn.nextToken();
			
			int s = Integer.parseInt(sString);
			
			int n = Integer.parseInt(nString);
			
			int[][] digitNumber = new int[(int)(Math.log10(n)+1)][2];
			
			int num = n;
			for(int a=0; a< digitNumber.length; a++){
				
				if(num % 10 == 0){
					digitNumber[a][1] = 123567;
				}else if(num % 10 == 1){
					digitNumber[a][1] = 36;
				}else if(num % 10 == 2){
					digitNumber[a][1] = 13457;
				}else if(num % 10 == 3){
					digitNumber[a][1] = 13467;
				}else if(num % 10 == 4){
					digitNumber[a][1] = 2346;
				}else if(num % 10 == 5){
					digitNumber[a][1] = 12467;
				}else if(num % 10 == 6){
					digitNumber[a][1] = 124567;
				}else if(num % 10 == 7){
					digitNumber[a][1] = 136;
				}else if(num % 10 == 8){
					digitNumber[a][1] = 1234567;
				}else if(num % 10 == 9){
					digitNumber[a][1] = 123467;
				}
				
				digitNumber[a][0] = num % 10;
				
				num /= 10;
			}
			
			
			char[][][] display = new char[(int) (Math.log10(n)+1)][2*s+3][s+2]; //[표현글자수][행][열]
			
			
			for(int k=0; k<display.length; k++){ // 빈공간에 전부 공간 넣기
				for(int j=0; j<display[i].length; j++){
					for(int m = 0; m<display[i][j].length; m++){
						display[k][j][m] = ' ';
					}
					
				}
			}
			
			char[][][] test = printArray(display, digitNumber); //글자 생성
			
			for(int b=0; b< 2*s+3; b++){
				for(int a= (int) (Math.log10(n)); a >= 0  ; a--){
					for(int c = 0; c< s+2; c++){
						System.out.print(test[a][b][c]);
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = sc = new Scanner(System.in);
		
		List testCase = new ArrayList();
		
		while(sc.hasNextLine()){
			
			String input = sc.nextLine();
			if(!input.equals("0 0")){
				testCase.add(input);
			}else{
				break;
			}
			
		}
		
		execute(testCase);
		
		
	}

}
