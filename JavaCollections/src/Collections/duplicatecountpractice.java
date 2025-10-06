package Collections;

import java.util.HashMap;
import java.util.Map;

public class duplicatecountpractice {
    public static void main(String[] args) {
        String str ="Hello World";
        //Convert to char array
        char chararray[] =str.toCharArray();

        //Create a hashmap
        HashMap<Character,Integer> duplicatemap = new HashMap<>();

        //Iterate using forloop
        for(char c: chararray){

            if(duplicatemap.containsKey(c)){

                duplicatemap.put(c,duplicatemap.get(c)+1);
            }
            else{
                duplicatemap.put(c,1);

            }

        }
        //Print using map entryset
        for(Map.Entry<Character,Integer> entry: duplicatemap.entrySet() ){

            if(entry.getValue()>1){

                System.out.println(entry.getKey()+":"+entry.getValue());

            }
        }
    }

}
