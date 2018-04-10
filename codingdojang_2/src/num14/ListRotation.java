package num14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListRotation {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String inputLine = sc.nextLine();
    	
    	sc.close();
    	
    	List<String> list = new ArrayList<>(Arrays.asList(inputLine.split(" ")));
    	
    	int count = Integer.parseInt(list.remove(0));
    	
    	if(count >= 0){
    		for(int i = 0; i<count; i++){
        		list.add(0,list.remove(list.size()-1));
        	}
    	}else{
    		for(int i = 0; i < Math.abs(count); i++){
        		list.add(list.size()-1, list.remove(0));
        	}
    	}
    	
    	list.forEach(str -> System.out.print(str + " "));
    	
    }
}
