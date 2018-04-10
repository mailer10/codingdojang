package num9;

import java.util.Scanner;

public class TugofWar {

	public static int arraySum(int[] param){
		
		int sum = 0;
		
		for(int i : param){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] array1 = new int[count/2];
		int[] array2 = new int[count % 2 == 1 ? count/2 +1 : count/2];
		for(int i=0; i<array1.length; i++){
			array1[i] = sc.nextInt();
		}
		for(int i=0; i<array2.length; i++){
			array2[i] = sc.nextInt();
		}
		sc.close();
		
		int sum1 = arraySum(array1);
		int sum2 = arraySum(array2);
		
		for(int i=0; i<array1.length; i++){
			for(int j=0; j<array2.length; j++){
				if(Math.abs(sum1 - sum2) > Math.abs(sum1 - array1[i] + array2[j]) - Math.abs(sum2 + array1[i] - array2[j])){
					int temp = array1[i];
					array1[i] = array2[j];
					array2[j] = temp;
					
					sum1 = arraySum(array1);
					sum2 = arraySum(array2);
				}
			}
		}
		if(sum1 < sum2){
			System.out.print(sum1 + " ");
			System.out.println(sum2);
		}else{
			System.out.print(sum2 + " ");
			System.out.println(sum1);
		}
		
	}

}
