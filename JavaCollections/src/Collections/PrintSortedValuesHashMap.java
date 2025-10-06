package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class PrintSortedValuesHashMap {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple",30);
        map.put("Banana",40);
        map.put("Chikoo",20);
        map.put("Litchi",70);

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);

        //print values
        for(int value : values){
            System.out.println(value);
        }
    }
}
