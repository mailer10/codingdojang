package num35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AustralianVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		String[] personName = new String[number];
		
		for(int i=0; i< number; i++){
			personName[i] = sc.nextLine();
		}
		List<String> voteList = new ArrayList<>();
		
		while(sc.hasNext()){
			voteList.add(sc.next() + sc.next() + sc.next());
			
		}
		
		System.out.println(voteList);
		
	}

}
