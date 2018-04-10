package num23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] i = new int[4];
		int[] j = new int[4];
		
		for(int n = 0; n <4; n++){
			i[n] = sc.nextInt();
			j[n] = sc.nextInt();
		}
		
		for(int l = 0; l < 4; l++){
			int cycleMaxmum = 0;
			for(int k = i[l]; k<=j[l]; k++){
				List<Integer> list = new ArrayList<>();
				int m = k;
				list.add(m);
				while(m != 1){
					if(m % 2 == 1){ //홀수 일때
						m = 3*m +1;
					}else{ //짝수일때
						m /= 2;
					}
					list.add(m);
				}
				if(cycleMaxmum < list.size()){
					cycleMaxmum = list.size();
				}
			}
			System.out.println(cycleMaxmum);
		}
		
	}

}
