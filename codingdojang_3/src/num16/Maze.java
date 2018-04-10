package num16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Point{
	
	int row = 0;
	int vertical = 0;
	char value = ' ';
	
	public Point(int row, int vertical, char value){
		this.row = row;
		this.vertical = vertical;
		this.value = value;
	}
	
}

public class Maze {
	
	static char[][] maze = null;
	
	public static boolean bfs(int row, int vertical){
		
		Queue<Point> queue = new LinkedList<>();
		
		queue.offer(new Point(row, vertical, '<'));
		
		while(!queue.isEmpty()){
			
			Point point = queue.poll();
			
			if(point.value == '>'){
				return true;
			}
			
			if(point.row > 0 && maze[point.row-1][point.vertical] != '#' && maze[point.row-1][point.vertical] != '0'){ //위 탐색
				queue.offer(new Point(point.row-1, point.vertical, maze[point.row-1][point.vertical]));
				maze[point.row-1][point.vertical] = '0';
			}
			if(point.row+1 < maze.length && maze[point.row+1][point.vertical] != '#' && maze[point.row+1][point.vertical] != '0'){ //아래 탐색
				queue.offer(new Point(point.row+1, point.vertical, maze[point.row+1][point.vertical]));
				maze[point.row+1][point.vertical] = '0';
			}
			if(point.vertical > 0 && maze[point.row][point.vertical-1] != '#' && maze[point.row][point.vertical-1] != '0'){ // 왼쪽 탐색
				queue.offer(new Point(point.row, point.vertical-1, maze[point.row][point.vertical-1]));
				maze[point.row][point.vertical-1] = '0';
			}
			if(point.vertical+1 < maze[0].length && maze[point.row][point.vertical+1] != '#' && maze[point.row][point.vertical+1] != '0'){ // 오른쪽 탐색
				queue.offer(new Point(point.row, point.vertical+1, maze[point.row][point.vertical+1]));
				maze[point.row][point.vertical+1] = '0';
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		try {
			sc = new Scanner(new File("C:\\Users\\present\\Desktop\\test\\maze.txt"));
			List<String> mazeRow = new ArrayList<>();
			
			while(sc.hasNext()){
				mazeRow.add(sc.nextLine());
			}
			
			maze = new char[mazeRow.size()][mazeRow.get(0).length()];
			
			for(int i=0; i < mazeRow.size(); i++){
				for(int j=0; j < mazeRow.get(i).length(); j++)
					maze[i][j] = mazeRow.get(i).charAt(j);
			}
			
			int startRow = 0;
			int startVertical = 0;
			
			start : for(int i=0; i< maze.length; i++){
				for(int j=0; j< maze[i].length; j++){
					if(maze[i][j] == '<'){
						startRow = i;
						startVertical = j;
						break start;
					}
				}
			}
			
			System.out.println(bfs(startRow, startVertical));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
