package num12;

public class NumberCommaInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = new String[]{"1000", "20000000", "-3245.24"};
		
		String num = null;
		
		for(int i=0; i<number.length; i++){
			
			num = number[i];
			
			if(num.contains(".") && num.length() > 3){
				int index = num.indexOf(".");
				StringBuffer sb = new StringBuffer(num);
				for(int j = index-3; j > 0; j=j-3){
					sb = sb.insert(j , ",");
				}
				System.out.println(sb.toString());
			}else if(num.length() > 3){
				StringBuffer sb = new StringBuffer(num);
				
				for(int j = sb.length()-3; j > 0; j=j-3){
					sb.insert(j , ",");
				}
				System.out.println(sb.toString());
			}
			
		}
		
	}

}
