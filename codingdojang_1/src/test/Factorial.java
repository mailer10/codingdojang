package test;

public class Factorial {

	public static int factorial(int number){
		
		int value = number;
		
		if(number == 1){
			return value;
		}
		
		return factorial(number-1) * number;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(10));

	}

}
