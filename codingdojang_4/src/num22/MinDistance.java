package num22;

public class MinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1, 3, 4, 8, 13, 17, 20};
		
		int distance = s[1] - s[0]; //첫 값
		int x = s[0];
		int y = s[1];
		
		for(int i = 0; i < s.length; i++){
			for(int j=i+1; j <s.length; j++){
				if(distance > s[j] - s[i]){
					distance = s[j] - s[i];
					x=s[i];
					y=s[j];
				}
			}
		}
		
		System.out.println("("+x+","+y+")");
		
	}

}
