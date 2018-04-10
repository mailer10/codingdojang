package num21;

import java.util.Scanner;

public class UnitChange {

	public static double INCH = 1;
	public static double CM = 2.54;
	public static double MM = 25.4;
	public static double PX = 96;
	public static double PT = 72;
	public static double DXA = 72 * 20;
	public static double EMU = 72 * 20 * 635;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		String param1 = sc.next();
		
		String param2 = sc.next();
		
		switch(param1){
			case "inch" : 
				num = num / INCH;
				break;
			case "cm" :
				num = num / CM;
				break;
			case "mm" :
				num = num / MM;
				break;
			case "px" :
				num /= PX;
				break;
			case "pt" :
				num /= PT;
				break;
			case "dxa" :
				num /= DXA;
				break;
			case "emu" :
				num /= EMU;
				break;
				
		}
		
		switch(param2){
		case "inch" : 
			num = num * INCH;
			break;
		case "cm" :
			num = num * CM;
			break;
		case "mm" :
			num = num * MM;
			break;
		case "px" :
			num *= PX;
			break;
		case "pt" :
			num *= PT;
			break;
		case "dxa" :
			num *= DXA;
			break;
		case "emu" :
			num *= EMU;
			break;
			
	}
		System.out.println("param1\t\tparam2\t\tresult");
		System.out.println("========================================");
		System.out.printf("%s\t\t%s\t\t%s",(int)num + param1, param2, (int)num + param2);
		
	}

}
