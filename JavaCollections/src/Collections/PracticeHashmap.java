package Collections;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashmap {

    public static void main(String args[]){
        //Input String
        String inputstr = "Hello World";
        //Convert it to chararray

        char[] charArray = inputstr.toCharArray();
        // Use Hashmap for storing key value pair

        Map<Character, Integer> dupliactemap = new HashMap<>();

        //Occurence for specific character
        char target = 'l';
        int count =0;
        //Iterate using for loop
        for(Character c : charArray){

            if(dupliactemap.containsKey(c)){
                dupliactemap.put(c,dupliactemap.get(c)+1);
            }else{
                dupliactemap.put(c,1);
            }
            //Count spaces
            if(dupliactemap.containsKey(" ")){
                dupliactemap.put(c,1);
            }
            //Count specific character
            if(c == target){
                count++;
            }

        }
        System.out.println("'"+target+":"+count);
        //Print map using entryset
        for(Map.Entry<Character,Integer> entryset : dupliactemap.entrySet()){
            //Print only repeating character
            if(entryset.getValue()>1){
                System.out.println(entryset.getKey() +":"+ entryset.getValue());
            }
            //Print all the values in Array including spaces
           // System.out.println(entryset.getKey() +":"+ entryset.getValue());
        }
    }



}
