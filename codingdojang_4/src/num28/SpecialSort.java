package num28;

import java.util.Arrays;

public class SpecialSort {

	public static int[] minusArray(int[] array){
		
		int count = 0;
		
		for(int i=0; i< array.length; i++){
			if(array[i] < 0){
				count++;
			}
		}
		
		int[] minusArray = new int[count];
		
		int minusCount = 0;
		
		for(int i = 0; i < array.length ; i++){
			if(array[i] < 0){
				minusArray[minusCount++] = array[i];
			}
		}
		
		return minusArray;
	}
	public static int[] plusArray(int[] array){
		
		int count = 0;
		
		for(int i=0; i< array.length; i++){
			if(array[i] > 0){
				count++;
			}
		}
		
		int[] plusArray = new int[count];
		
		int plusCount = 0;
		
		for(int i = 0; i < array.length ; i++){
			if(array[i] > 0){
				plusArray[plusCount++] = array[i];
			}
		}
		
		return plusArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-1, 1, 3, -2, 2};
		
		int[] array1 = minusArray(array);
		int[] array2 = plusArray(array);
		
		int[] array3 = new int[array1.length + array2.length];
		
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		System.out.println(Arrays.toString(array3));
		
		
	}

}
