package num20;

import java.util.Scanner;

public class boardPaging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int totalCount = sc.nextInt();
		int count = sc.nextInt();
		
		sc.close();
		
		if(totalCount % count > 0){
			System.out.println(totalCount / count +1);
		}else{
			System.out.println(totalCount / count);
		}
		
	}

}
