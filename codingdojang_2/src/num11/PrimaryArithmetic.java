package num11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimaryArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		while(sc.hasNext()){
			
			String inputLine = sc.nextLine();
			
			if(inputLine.equals("0 0")){
				break;
			}else{
				list.add(inputLine);
			}
		}
		sc.close();
		for(int i=0; i< list.size(); i++){
			
			String[] values = list.get(i).split(" ");
			
			int left = Integer.parseInt(values[0]);
			int right = Integer.parseInt(values[1]);
			
			int count = 0;
			
			while(left > 0 && right > 0){
				int l_digit = left % 10;
				left /= 10;
				int r_digit = right % 10;
				right /= 10;
				
				if(l_digit+ r_digit > 9){
					count++;
					left++;
				}
			}
			
			System.out.println( (count == 0 ? "No" : count) + " carry operations.");
			
		}
	}

}
