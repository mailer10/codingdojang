package num10;

import java.util.Scanner;

public class FouBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[4];
		
		for(int i=0; i<4; i++){
			input[i] = sc.nextLine();
		}
		sc.close();

		int[][] plane = new int[1001][1001];
		
		int x1, x2, y1, y2;
		
		for(int i=0; i<input.length; i++){
			String[] point = input[i].split(" ");
			x1 = Integer.parseInt(point[0]);
			y1 = Integer.parseInt(point[1])-1;
			x2 = Integer.parseInt(point[2]);
			y2 = Integer.parseInt(point[3])-1;
			
			for(int k = x1; k < x2; k++){
				for(int j = y1; j < y2; j++){
					plane[k][j] = 1;
				}
			}
		}
		
		int area = 0;
		
		for(int i=0; i< 1001; i++){
			for(int j=0; j<1001; j++){
				if(plane[i][j] == 1){
					area++;
				}
			}
		}
		
		System.out.println(area);
		
	}

}
