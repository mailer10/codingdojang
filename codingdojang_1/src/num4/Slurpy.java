package num4;

import java.util.Scanner;

public class Slurpy {

	public static boolean isSlurpy(String verb){
		
		int isSlurpyIndex = 0;
		
		verb = verb.toLowerCase();
		
		for(isSlurpyIndex=0; isSlurpyIndex < verb.length(); isSlurpyIndex++){
			
			String isSlimpVerb = verb.substring(0, isSlurpyIndex);
			String isSlumpVerb = verb.substring(isSlurpyIndex, verb.length());
			
			if(isSlimp(isSlimpVerb) && isSlump(isSlumpVerb)){
				return true;
			}else{
				continue;
			}
			
		}
		return false;
		
	}
	
	
	public static boolean isSlump(String verb){
				
		int isSlumpIndex = 0;
		
		verb = verb.toLowerCase();
		
		try{
			
			if(verb.substring(isSlumpIndex,isSlumpIndex+1).equals("d")){
				isSlumpIndex++;
			}else if(verb.substring(isSlumpIndex,isSlumpIndex+1).equals("e")){
				isSlumpIndex++;
			}else{
				return false;
			}
			
			if(!verb.substring(isSlumpIndex, isSlumpIndex+1).equals("f")){
				return false;
			}else{
				isSlumpIndex++;
				boolean isF = true;
				while(isF){
					if(!verb.substring(isSlumpIndex,isSlumpIndex+1).equals("f")){
						isF = false;
					}else{
						isSlumpIndex++;
					}
					
				}
				isF = false;
				
				if(verb.substring(isSlumpIndex,isSlumpIndex+1).equals("g") && verb.length() == isSlumpIndex+1){
					return true;
				}else{
					if(isSlump(verb.substring(isSlumpIndex))){
						return true;
					}else{
						return false;
					}
				}
			}
			
		}catch(StringIndexOutOfBoundsException e){
			return false;
		}
		
		
		
	}
	
	public static boolean isSlimp(String verb){
		
		
		int isSlimpIndex = 0;
		
		verb = verb.toLowerCase();
		
		try{
			if(verb.substring(isSlimpIndex,isSlimpIndex+1).equals("a")){
				isSlimpIndex++;
			}else{
				return false;
			}
			
			if(verb.length() == 2 && verb.substring(isSlimpIndex,isSlimpIndex+1).equals("h")){
				return true;
			}
			
			if(verb.substring(isSlimpIndex, isSlimpIndex+1).equals("b")){
				isSlimpIndex++;
				if(isSlimp(verb.substring(isSlimpIndex, verb.length()-1))){
					if(verb.substring(verb.length()-1,verb.length()).equals("c")){
						return true;
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
			
			if(isSlump(verb.substring(isSlimpIndex,verb.length()-1)) && verb.substring(verb.length()-1,verb.length()).equals("c")){
				return true;
			}else{
				return false;
			}
		}catch(StringIndexOutOfBoundsException e){
			return false;
		}
		
		
		
	}
	
	public static void execute(String[] inputString){
		
		boolean[] result = new boolean[inputString.length];
		
		int count = 0;
		
		for(String str : inputString){
			result[count] = isSlurpy(str);
			count++;
		}
		
		System.out.println("SLURPYS OUTPUT");
		for(boolean str : result){
			System.out.println(str ? "YES" : "NO");
		}
		System.out.println("END OF OUTPUT");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		String[] inputString = new String[count];
		
		for(int i=0; i<count; i++){
			inputString[i] = sc.next();
		}
		sc.close();
		
		execute(inputString);
		
	}

}
