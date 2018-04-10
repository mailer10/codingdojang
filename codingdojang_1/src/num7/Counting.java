package num7;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		long beginTime = System.currentTimeMillis();
		
		for(int i=1; i<=10000 ;i++ ){
		
			Integer number = new Integer(i);
			
			String numberString = number.toString();
			
			int n= 0;
			
			while(n < numberString.length()){
				char c = numberString.charAt(n);
				if(c == '8'){
					count++;
				}
				n++;
			}
			
		}
		
		long afterTime = System.currentTimeMillis();
		
		long time = afterTime - beginTime;
		
		System.out.println( (double)time / 1000 + "초" );

		System.out.println(count);
		
	}

}
