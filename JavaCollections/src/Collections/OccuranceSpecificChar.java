package Collections;

import java.util.HashMap;
import java.util.Map;

public class OccuranceSpecificChar {
        public static void main(String args[]) {
            //Input String
         /*   String str = "Hello";
            String strinput = str.toLowerCase();
            char[] strarray = strinput.toCharArray();
            char target = 'l';
            int count = 0;

            for (Character c : strarray) {

                if(c == target){
                    count++;
                }

            }
            System.out.println("'"+target+"'" +":" +count);

        */

        //Input String
            String str ="Hello World";
            String inputstr = str.toLowerCase();
            //Convert to char array
            char [] strarr = inputstr.toCharArray();
            char targetvar = 'o';
            int count = 0;

            for(Character c : strarr){

                if(c == targetvar ){
                    count++;
                }
            }
            System.out.println("'"+targetvar+"'"+":"+count);

        }
}
