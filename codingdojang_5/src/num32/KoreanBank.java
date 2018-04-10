package num32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KoreanBank {
	
	
	public static String execute(String cash){
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<cash.length(); i++){
			if(cash.charAt(i) == '경'){
				
			}else if(cash.charAt(i) == '조'){
				
			}else if(cash.charAt(i) == '억'){
				
			}else if(cash.charAt(i) == '만'){
				
			}
		}
		
		return "";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String cash = sc.next();
		
		String str = execute(cash);
		
		System.out.println(str.equals("-1") ? "false" : str);
		
		
		
	}

}
