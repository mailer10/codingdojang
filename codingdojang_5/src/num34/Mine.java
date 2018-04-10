package num34;

import java.util.Scanner;

public class Mine {

	public static String[][] execute(String[][] param){
		
		String[][] matrix = new String[param.length][param[0].length];
		
		for(int i=0; i< param.length; i++){
			for(int j=0; j<param[0].length; j++){
				if(param[i][j].equals("*")){ //지뢰인경우
					matrix[i][j] = "*";
				}else{ //지뢰아니면
					int count = 0;
					if(i > 0 && j > 0 && param[i-1][j-1].equals("*")){ // 좌상
						count++;
					}
					if(i > 0 && param[i-1][j].equals("*")){ // 상
						count++;
					}
					if(i > 0 && j < param[0].length-1 && param[i-1][j+1].equals("*")){ // 우상
						count++;
					}
					if(j < param[0].length-1 && param[i][j+1].equals("*")){ // 우
						count++;
					}
					if(i < param.length-1 && j < param[0].length-1 && param[i+1][j+1].equals("*")){ // 우하
						count++;
					}
					if(i < param.length-1 && param[i+1][j].equals("*")){ // 하
						count++;
					}
					if(i < param.length-1 && j > 0 && param[i+1][j-1].equals("*")){ // 좌하
						count++;
					}
					if(j > 0 && param[i][j-1].equals("*")){ // 좌
						count++;
					}
					matrix[i][j] = Integer.toString(count);
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int vertical = sc.nextInt();
		
		String[][] matrix = new String[row][vertical];
		
		for(int i=0; i< row; i++){
			String[] inputLine = sc.next().split("");
			for(int j = 0; j < vertical; j++){
				matrix[i][j] = inputLine[j];
			}
		}
		sc.close();
		
		matrix = execute(matrix);
		
		for(int i=0; i< row; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
