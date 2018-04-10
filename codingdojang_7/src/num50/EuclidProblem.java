package num50;

import java.util.Scanner;

public class EuclidProblem {

	public static int gcd(int a, int b) {
	    while (b != 0) {
	      int temp = a % b;
	      a = b;
	      b = temp;
	    }
	    return Math.abs(a);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++){
			String[] numbers = sc.nextLine().split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			int result = gcd(a,b);
			int x = 0;
			int y = 0;
			
			int count = 0;
			while(true){
				if(result == a * x + b * y){
					break;
				}else{
					if(count % 3 == 0){
						x--;
					}else if(count % 3 == 1){
						x++;
						y++;
					}else if(count % 3 == 2){
						x--;
					}
					count++;
				}
			}
			System.out.println(x + " " + y + " " +result);
		}
		sc.close();
		
	}

}
