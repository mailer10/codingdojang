package num2;

import java.util.Scanner;

public class SpiralArray {

	static int xMax = 0, yMax = 0; // 끝나는 위치
	static int xMin = 0, yMin = 0; // 끝나는 위치
	
	public static int[][] execute(int x, int y){
		
		int[][] spiralArray = new int[x][y];
		
		int direction = 0; // 방향 0: 오른쪽, 1:아래쪽, 2:왼쪽, 3: 위쪽
		
		int count = 0;
		
		int fin = x * y;
		
		boolean go = true;
		
		x=0; y=0; // 반복문 전에 초기화
		xMax--;
		yMax--;
		
		while(go){
			// 반복
			
			if(count == fin){
				break;
			}
			
			direction %= 4;
			
			if(direction == 0){ //오른쪽방향
				
				spiralArray[x][y] = count;
				if(y == yMax){
					direction++;
					x++;
					xMin++;
				}else{
					y++;
				}
				
			}else if(direction == 1){ //아래 방향
				spiralArray[x][y] = count;
				if(x == xMax){
					direction++;
					y--;
					yMax--;
				}else{
					x++;
				}
				
			}else if(direction == 2){ //왼쪽 방향
				spiralArray[x][y] = count;
				if(y == yMin){
					direction++;
					x--;
					xMax--;
				}else{
					y--;
				}
			}else if(direction == 3){ // 위쪽 방향
				spiralArray[x][y] = count;
				if(x == xMin){
					direction++;
					y++;
					yMin++;
				}else{
					x--;
				}
			}
			
			count++;
			
		}
		
		return spiralArray;
		
	}
	
	public static void terminate(int[][] array){
		
		for(int i = 0; i<array.length; i++){
			for(int j=0; j<array[i].length ; j++){
				System.out.printf("%2d ", array[i][j]);
						
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		xMax = sc.nextInt(); // 행
		yMax = sc.nextInt(); // 열
		
		sc.close();
		
		terminate(execute(xMax, yMax));
		
		
	}

}
