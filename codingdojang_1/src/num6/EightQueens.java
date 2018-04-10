package num6;

import java.util.Arrays;

public class EightQueens {
	
	static int successCount = 0;
	static int failCount = 0;
	
	public static void board(int row, int vertical, boolean[][] paramBoard, int count){
		
		boolean[][] board = new boolean[8][8];
		
		for(int i = 0; i< paramBoard.length; i++ ){
			System.arraycopy(paramBoard[i], 0, board[i], 0, paramBoard.length);
		}
		
		if(!board[row][vertical]){ // 퀸을 둘수 없을 경우
			
			if(vertical < 7){
				board(row, vertical+1, board, count);
			}else if(vertical == 7){
				board(row+1, 0, board, count);
			}
			
		}else{ //퀸을 둘수 있을 경우
			
			for(int i=0; i<row; i++){ // 퀸 있는 같은 위 row 모두 false 처리
				board[i][vertical] = false;
			}
			for(int i=row+1; i<8; i++){ // 퀸 있는 같은 아래 row 모두 false 처리
				board[i][vertical] = false;
			}
			for(int i=0; i<vertical; i++){ // 퀸 있는 같은 왼쪽 vertical 모두 false 처리
				board[row][i] = false;
			}
			for(int i=vertical+1; i<8; i++){ // 퀸 있는 같은 오른쪽 vertical 모두 false 처리
				board[row][i] = false;
			}
			for(int i = row-1, j = vertical-1; i >= 0 && j >= 0 ; i--, j--){ // 퀸 있는 좌상 방향 모두 false 처리
				board[i][j] = false;
			}
			for(int i = row-1, j = vertical+1; i >= 0 && j < 8 ; i--, j++){ // 퀸 있는 우상 방향 모두 false 처리
				board[i][j] = false;
			}
			for(int i = row+1, j = vertical+1; i < 8 && j < 8 ; i++, j++){ // 퀸 있는 우하 방향 모두 false 처리
				board[i][j] = false;
			}
			for(int i = row+1, j = vertical-1; i < 8 && j >= 0 ; i++, j--){ // 퀸 있는 좌하 방향 모두 false 처리
				board[i][j] = false;
			}

			count--;
			
			if(row == 7 && count == 0){
				successCount++;
				return;
				
			}else{
				for(int i=0; i<8; i++){
					if(board[row+1][i]){
						board(row+1, i, board, count);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		boolean[][] board = new boolean[8][8];
		
		for(int i=0; i<8; i++){
			Arrays.fill(board[i], 0, board[i].length, true);
		}
		
		int count = 8;
		
		for(int i = 0; i < 8; i++){
			board(0, i, board, count); // 이걸 vertical 0~8까지 해주면 될듯
		}
		
		System.out.println(successCount);
		
	}

}
