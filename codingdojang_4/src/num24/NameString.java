package num24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inputLine = sc.nextLine();
		
		sc.close();
		
		String[] names = inputLine.split(",");
		
		int countKim = 0;
		int countLee = 0;
		
		int countLeeJaeyoung = 0;
		
		for(String name : names){
			if(name.charAt(0) == '김'){
				countKim++;
			}
			if(name.charAt(0) == '이'){
				countLee++;
			}
		}
		
		System.out.println("김씨 : " + countKim);
		System.out.println("이씨 : " + countLee);
		
		for(String name : names){
			if(name.equals("이재영")){
				countLeeJaeyoung++;
			}
		}
		System.out.println("이재영 : "+ countLeeJaeyoung);
		
		Set<String> set = new HashSet<>();
		
		for(String name : names){
			set.add(name);
		}
		System.out.println(set);
		
		List<String> nameList = new ArrayList<>(set);
		Collections.sort(nameList, new Comparator<String>() { // 내림차순으로 해봄

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.compareTo(o2) > 0){
					return -1;
				}else if(o1.compareTo(o2) < 0){
					return 1;
				}else{
					return 0;
				}
			}
		});
		System.out.println(nameList);
		
	}

}
