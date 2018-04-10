package num42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LightMoreLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> resultList = new ArrayList<>();
		
		while(true){
			int number = sc.nextInt();
			if(number == 0){ // 0이면 반복문 나가기
				break;
			}
			
			int[] lightArray = new int[number+1];
			
			for(int i = 1; i <= number; i++){
				for(int j=1 ; j < lightArray.length; j++){
					if(j % i == 0){
						lightArray[j]++;
					}
				}
			}
			
			resultList.add(lightArray[number] % 2 == 0 ? "no" : "yes");
			
		}
		for(String str : resultList){
			System.out.println(str);
		}
	}

}
