package num25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PotsofGoldGame {
	
	int lineNum;
	int value;
	double percent;
	char selecter;
	
	public PotsofGoldGame(int lineNum, int value, double percent){
		
		this.lineNum = lineNum;
		this.value = value;
		this.percent = percent;
	}
	public void setSelecter(char selecter){
		this.selecter = selecter;
	}
	
	public static PotsofGoldGame select(PotsofGoldGame[] param, int front, int rear, int count){
		
		if(front > rear){
			return null;
		}
		
		if(param[front].percent > param[rear].percent){ // 앞쪽이 크면
			if(param[front+1].percent > param[rear].percent){ // 이후 비교
				if(count % 2 == 1){
					param[rear].selecter = 'A';
				}else{
					param[rear].selecter = 'B';
				}
				return param[rear];
			}else{
				if(count % 2 == 1){
					param[front].selecter = 'A';
				}else{
					param[front].selecter = 'B';
				}
				return param[front];
			}
		}else{ // 뒤쪽이 크면
			if(param[rear-1].percent > param[rear].percent){ // 이후 비교
				if(count % 2 == 1){
					param[front].selecter = 'A';
				}else{
					param[front].selecter = 'B';
				}
				return param[front];
			}else{
				if(count % 2 == 1){
					param[rear].selecter = 'A';
				}else{
					param[rear].selecter = 'B';
				}
				return param[rear];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<PotsofGoldGame> queue = new LinkedList<>();
		
		int[] line = {10,8,7,6,5,4,3,1,2};
		
		int lineSum = 0;
		
		for(int i=0; i<line.length; i++){
			lineSum += line[i];
		}
		PotsofGoldGame[] pArray = new PotsofGoldGame[line.length];
		
		for(int i=0; i<line.length; i++){
			pArray[i] = new PotsofGoldGame(i, line[i], (double)line[i]/lineSum*100);
		}
		int count = 0;
		for(int i=0; i< line.length; i++){
			queue.offer(select(pArray, i, line.length, count++));
		}
		
		

		
	}

}
