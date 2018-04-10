package num27;

import java.util.Scanner;

public class Kpalindrome {

	public static boolean execute(String input, int k, int left, int right){
		
		if(k < 0){
			return false;
		}
		
		if( left >= right){
			return true;
		}
		
		boolean result = false;
		
		if(input.charAt(left) == input.charAt(right)){
			result = execute(input, k, left+1, right-1);
		}else{
			
			result = execute(input, k-1, left+1, right) || execute(input, k-1, left , right-1);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int k = sc.nextInt();
		
		System.out.println(execute(input, k, 0 , input.length()-1) ? "YES" : "NO");
	}

}
