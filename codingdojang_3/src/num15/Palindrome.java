package num15;

import java.util.Scanner;

public class Palindrome {

	public static String execute(int num){

		long count=0;
		int listCount = 0;
		String number = null;
		
		while(listCount < num){
			boolean flag = true;
			String numString = count + "";
			int lastDigit = 0;
			int firstDigit = numString.length()-1;
			while(lastDigit <= firstDigit && flag){
				
				if(numString.charAt(lastDigit) == numString.charAt(firstDigit)){
					lastDigit++;
					if(firstDigit>0) firstDigit--;
				}else{
					flag = false;
				}
			}
			if(flag){
				listCount++;
				number = numString;
				
			}
			count++;
		}
	
		return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(execute(n));
	}

}
