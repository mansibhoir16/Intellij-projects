package Collections;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateValues {

    public static void main(String args[]){

        //Input array
        int[] arr = {1,2,4,2,5,4};

        Map<Integer,Integer> duplicateno = new HashMap<>();
        //Iterate using for loop

        for(Integer num : arr){

            if(duplicateno.containsKey(num)){
                duplicateno.put(num, duplicateno.get(num)+1);
            }else{
                duplicateno.put(num,1);
            }

        }

        //Print using Entryset
       for ( Map.Entry<Integer,Integer> entryset : duplicateno.entrySet()){
            //Print only duplicate values
           if(entryset.getValue()>1){
               System.out.println(entryset.getKey()+":"+entryset.getValue());
           }
           //Print all the Values
           System.out.println(entryset.getKey()+":"+entryset.getValue());
       }

    }
}
