package Collections;

import java.util.HashMap;
import java.util.Map;

public class AddRemoveHashMap {

    public static void main(String[] args) {

        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Mango",1);
        hashmap.put("Cherry",2);
        hashmap.put("Litchi",3);

        System.out.println("Original Map: "+hashmap);

        String removedValue = String.valueOf(hashmap.remove("Cherry"));
        System.out.println("Removed Value: "+removedValue);
        System.out.println("Modified Map: "+hashmap);
    }
}
