package num30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberString {

	public static Map<String, Character> numberSplit(String inputNumber){
		
		Map<String,Character> numbers = new HashMap<>();
		
		for(int i = 0; i<inputNumber.length()-1; i++){
			for(int j = i; j <= inputNumber.length() ; j++){
				if(i+j <= inputNumber.length()){
					if(!inputNumber.substring(i, i+j).equals("") && inputNumber.substring(i, i+j).length() < 3 && Integer.parseInt(inputNumber.substring(i, i+j)) < 27){
						numbers.put(inputNumber.substring(i, i+j), new Character((char) (96 + Integer.parseInt(inputNumber.substring(i, i+j).toString())) ));
					}
				}
			}
		}
		
		return numbers;
	}
	
	static List<String> totalCase = new ArrayList<>();
	
	public static void totalCase(String inputNumber, int left, int right){
		
		if(left >= right){
			totalCase.add(inputNumber);
		}else{
			totalCase(inputNumber.substring(left, right), left+1, right+1);
			totalCase(inputNumber.substring(left, right), left+1, right+2); 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputNumber = "1123";
		
		Map<String, Character> numbers = numberSplit(inputNumber);
		
		totalCase(inputNumber, 0, 1);
		
		System.out.println(numbers);
		
	}

}
