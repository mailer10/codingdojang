package num1;

import java.util.HashMap;
import java.util.Map;

public class Generator {
	
	public static void main(String[] args) {

		int result = 0; //selfnumber의 합 결과
		
		Map<Integer, Integer> list = new HashMap<>(); // key에 1~4999숫자, value에는 key의 각자리수+원래수 의 합
		
		list = generator(); // generator() 호출시 1부터 4999까지의 각자리수+원래수 값을 담는다.
		
		System.out.println(selectSelfNumber(list)); // map list 에 담겨있지 않은 selfNumber의 값 합을 리턴하여 값 출력
		
	}
	
	public static Map<Integer, Integer> generator(){
		
		Map<Integer, Integer> list = new HashMap<>();
		
		int j = 1;
		
		for(; j < 5000; j++){
			int sum = 0; //각자리수 + 원래값의 합
			int checkNum = j; // 1부터 4999까지 체크하기 위해 선언
			int digit = 0; // 각자리수
			
			sum = checkNum % 10;
			checkNum = checkNum / 10;
			
			while(checkNum > 0){ //원래값이 두자리 이상인경우
				digit = checkNum % 10;
				checkNum = checkNum / 10;
				sum += digit;
			}
			
			sum += j; // 원래값 합하기
			
			list.put(j, sum); // 키 : 원래값, value : 각자리수 + 원래값
		}
		
		return list;
	}
	
	public static int selectSelfNumber(Map<Integer, Integer> list){
		
		boolean value = false; // selfNumber인지 아닌지
		
		int sum = 0; //셀프넘버의 합
		
		for(int i=1; i< 5000; i++){
			
			value = list.containsValue(i); //1~4999까지 value값과 비교해서 있으면 true, 없으면 false(selfNumber)
			
			if(value != true){ //false인경우 합한다.
				sum += i;
			}
		}
		return sum;
		
		
	}
	

}
