package num13;

import java.util.Scanner;

public class CountingCodeLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int lineCount = 0;
		
		while(sc.hasNext()){
			String codeLine = sc.nextLine();
			try{
				if(codeLine.trim().charAt(0) != ' ' && codeLine.trim().charAt(0) != '/' && codeLine.trim().charAt(0) != '*' ){
					lineCount++;
				}
			}catch(Exception e){
				continue;
			}
		}
		sc.close();
		
		System.out.println(lineCount);
	}

}
