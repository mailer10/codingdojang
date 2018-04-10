package num39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Maze {

	public static void execute(int c, int r, String[][] maze){
		
		Queue<Point> queue = new LinkedList<>();
		
		queue.offer(new Point(1, c/2));
		maze[1][c/2] = 0 +"";
		
		boolean wayFlag = false; // 막다른곳이면 false, 다른곳으로 이동 가능이면 true
		
		List<Integer> falseWayList = new ArrayList<>();
		
		while(!queue.isEmpty()){ //BFS 큐가 비어있지 않은 경우
			
			Point point = queue.poll();
			
			wayFlag = false;
			// 갈수 있는 경로 큐에 추가
			if(point.x > 0 && maze[point.x-1][point.y].equals(".")){ // 위
				maze[point.x-1][point.y] = Integer.parseInt(maze[point.x][point.y])+1 + "";
				queue.offer(new Point(point.x-1, point.y));
				wayFlag= true;
			}
			if(point.x < r-1 && maze[point.x+1][point.y].equals(".")){ // 아래
				maze[point.x+1][point.y] = Integer.parseInt(maze[point.x][point.y])+1 + "";
				queue.offer(new Point(point.x+1, point.y));
				wayFlag= true;
			}
			if(point.y > 0 && maze[point.x][point.y-1].equals(".")){ // 왼쪽
				maze[point.x][point.y-1] = Integer.parseInt(maze[point.x][point.y])+1 + "";
				queue.offer(new Point(point.x, point.y-1));
				wayFlag= true;
			}
			if(point.y < c-1 && maze[point.x][point.y+1].equals(".")){ // 오른쪽
				maze[point.x][point.y+1] = Integer.parseInt(maze[point.x][point.y])+1 + "";
				queue.offer(new Point(point.x, point.y+1));
				wayFlag= true;
			}
				
			if(!wayFlag){ // 구석인 경우
				if(!maze[point.x][point.y].equals("e")){
					falseWayList.add(Integer.parseInt(maze[point.x][point.y]));
				}
			}
		}
		
		Collections.sort(falseWayList);
		
		System.out.println("Maximum rope length is " + (falseWayList.size() > 0 ? falseWayList.get(falseWayList.size()-1)  : 0) + ".");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();  //테스트케이스 수
		
		for(int i=0; i<t; i++){
			
			int c = sc.nextInt(); // 열 수 3 <= C
			int r = sc.nextInt();  // 행 수 R <= 1000
			sc.nextLine(); // 줄바꿈 삭제
			String[][] maze = new String[r][c]; // 미로 배열
			
			for(int j=0 ; j < r; j++){
				String[] str = sc.nextLine().split("");
				for(int k=0; k < str.length; k++){
					maze[j][k] = new String(str[k]);
				}
			}
			
			execute(c, r, maze);
			
		}
		
	}

}
