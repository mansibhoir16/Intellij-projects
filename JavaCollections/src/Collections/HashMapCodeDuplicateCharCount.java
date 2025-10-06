package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCodeDuplicateCharCount {

    public static void main(String args[]){

        //Input String
        String inputstr = "Hello Honey";
        //Convert string to char array
        char[] charArray = inputstr.toCharArray();
        //Create a hashmap
        Map<Character,Integer> duplicatemap = new HashMap<>();

        for (char c : charArray){
        //get value by key and increment by 1
            if(duplicatemap.containsKey(c)){
                duplicatemap.put(c,duplicatemap.get(c)+1);
            }else{
                duplicatemap.put(c,1);
            }

        }
        //For printing we will use entryset
       for(Map.Entry<Character,Integer> entry : duplicatemap.entrySet()){

           if(entry.getValue()>1){
            System.out.println(entry.getKey() +":"+ entry.getValue());
           }

       }




    }
}
