package num8;

import java.util.Date;

public class Subdate {

	public static int compute(String dateInput){
		
		int result = 0;
		
		int intYear = Integer.parseInt(dateInput.substring(0,4));
		
		int intMonth = Integer.parseInt(dateInput.substring(4, 6));
		
		int intDate = Integer.parseInt(dateInput.substring(6));
		
		result = (intYear * 365) + (intYear / 4) + (intYear / 400) - (intYear / 100);
		
		if(intMonth == 1){ //31
			result += intDate;
		}else if(intMonth == 2){ //28
			result += intDate + 31;
		}else if(intMonth == 3){//31
			result += intDate + 59;
		}else if(intMonth == 4){//30
			result += intDate + 90;
		}else if(intMonth == 5){//31
			result += intDate + 120;
		}else if(intMonth == 6){//30
			result += intDate + 151;
		}else if(intMonth == 7){//31
			result += intDate + 181;
		}else if(intMonth == 8){//31
			result += intDate + 212;
		}else if(intMonth == 9){//30
			result += intDate + 243;
		}else if(intMonth == 10){//31
			result += intDate + 273;
		}else if(intMonth == 11){//30
			result += intDate + 304;
		}else if(intMonth == 12){//31
			result += intDate + 334;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = Math.abs(compute("20070515") - compute("20070501"));
		
		System.out.println("20070515 sub 20070501 = " + result);
		
		result = Math.abs(compute("20070501") - compute("20070515"));
		
		System.out.println("20070501 sub 20070515 = " + result);
		
		result = Math.abs(compute("20070301") - compute("20070515"));
		
		System.out.println("20070301 sub 20070515 = " + result);
		
	}

}
