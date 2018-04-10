package num41;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EveryOtherDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		
		Pattern p = Pattern.compile("[0-9]");
		
		for(int i=1; i< sb.length(); i=i+2){
			if(p.matcher(sb.substring(i, i+1)).find()){
				sb.replace(i, i+1, "*");
			}
		}
		System.out.println(sb.toString());
	}

}
