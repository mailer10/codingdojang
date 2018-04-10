package num33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	
	int num;
	int team;
	
	public Person(int num, int team){
		this.num = num;
		this.team = team;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int isTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	
}

public class SpyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int personNum = sc.nextInt();
		int orderNum = sc.nextInt();
		
		
		Person[] personArray = new Person[personNum];
		
		for(int i = 0; i<personNum; i++){
			personArray[i] = new Person(i, '0');
		}
		
		Queue<Person> queue1 = new LinkedList<>();
		Queue<Person> queue2 = new LinkedList<>();
		
		for(int i=0; i<orderNum; i++){
			
			int front = sc.nextInt();
			int rear = sc.nextInt();
			String relation = sc.next();
			
			if(relation.equals("f")){ //친구인 경우
				
			}
			
			
		}
		
		
		
	}

}
