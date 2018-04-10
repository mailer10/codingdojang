package num5;

import java.util.HashSet;
import java.util.Set;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> list = new HashSet<>();
		
		int a = 3;
		int b = 5;
		
		for( ; a < 1000; a=a+3){
			list.add(a);
		}
		for( ; b < 1000; b=b+5){
			list.add(b);
		}
		
		int sum = 0;
		
		for(int i : list){
			sum += i;
		}
		System.out.println(sum);
	}

}
