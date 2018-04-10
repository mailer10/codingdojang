package num51;

import java.util.Scanner;

public class Steps {

	public static int solve(int head, int rear){
		
		int count = 0; // 단계수
		int level = 1; // 현재 단계
		int order = 0; // true면 앞 먼저, false면 뒤 먼저
		while(true){
			if(head == rear){
				break;
			}
			
			//rear > head 인경우
			int hrDistance = rear - head;
			
			if(hrDistance < level){
				level--;
			}
			
			if(hrDistance >= level && order % 3 == 0){
				head += level;
				count++;
				order++;
				continue;
			}
			if(hrDistance >= level && order % 3 == 1){
				rear -= level;
				count++;
				order++;
				continue;
			}
			if(hrDistance >= level && order % 3 == 2){
				level++;
				order++;
				continue;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i< testCase; i++){
			String[] inputLine = sc.nextLine().split(" ");
			int head = Integer.parseInt(inputLine[0]);
			int rear = Integer.parseInt(inputLine[1]);
			
			int count = solve(head, rear);
			
			System.out.println(count);
		}
	}

}
