package num49;

import java.util.ArrayList;
import java.util.List;

public class UglyNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> uglyList = new ArrayList<>();
        int start = 1;
        uglyList.add(start++);
        int temp = start;
        while(uglyList.size() < 1500){

            if(temp % 2 == 0 || temp % 3 == 0 || temp % 5 == 0){
                if(temp % 2 == 0){
                    temp /= 2;
                }
                if(temp % 3 == 0){
                    temp /= 3;
                }
                if(temp % 5 == 0){
                    temp /= 5;
                }
            }else if(temp == 1){
                uglyList.add(start++);
                temp = start;
            }else{
                temp = ++start;
            }

        }
        System.out.println(uglyList.get(uglyList.size()-1));
    }

}