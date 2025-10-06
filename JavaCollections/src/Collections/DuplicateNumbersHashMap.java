package Collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersHashMap {
    public static void main(String[] args) {
        int arr[] ={11,12,11,13,14,14,15};
        //Create map
        Map<Integer,Integer> duplicatemap = new HashMap<>();
        //Iterate using for loop
        for(int i : arr){
            if(duplicatemap.containsKey(i)){
                duplicatemap.put(i, duplicatemap.get(i)+1);
            }
            else{
                duplicatemap.put(i,1);
            }
        }
        //Print using entryset
        for(Map.Entry<Integer,Integer> entry : duplicatemap.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ " : "+ entry.getValue());
            }
        }
    }
    }



