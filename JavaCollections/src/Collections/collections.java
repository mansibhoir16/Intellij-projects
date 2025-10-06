package Collections;
import java.util.*;
public class collections {

public static void  main(String args[]){

    // Add integers to an arraylist

    ArrayList <Integer> Intarr = new ArrayList<>();
    ArrayList <Integer> arr2 = new ArrayList<>();
            arr2.add(2);
            arr2.add(3);
            arr2.add(7);
            arr2.add(11);
            arr2.add(12);


            Intarr.add(1);
            Intarr.add(5);
            Intarr.add(6);
            Intarr.add(2);
            Intarr.add(9);
            Intarr.addAll(arr2);
            //Removes no of index 2
            Intarr.remove(2);
            //Returns true if array is empty
            Intarr.isEmpty();
            Intarr.set(0,344);
            System.out.println(Intarr.contains(17));
            System.out.println(Intarr.indexOf(5));
            System.out.println("Last Index"+Intarr.lastIndexOf(2));


            for(int i=0; i<Intarr.size(); i++){

                System.out.println(Intarr.get(i));

            }
}




}
