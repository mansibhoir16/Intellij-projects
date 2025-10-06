package Collections;

import java.util.Arrays;

public class SortStringAlphabetically {

    public static void main(String args[]){
        //Approach-1
        String str = "java";
        char [] inputarr = str.toCharArray();
        char temp;
        for(int i =0; i<inputarr.length; i++){

            for(int j =0; j<inputarr.length-1; j++ ){

                if (inputarr[i] > inputarr[j]) {
                    temp = inputarr[i];
                    inputarr[i] = inputarr[j];
                    inputarr[j] = temp;

                }
            }
        }
        System.out.println(new String (inputarr));


        //Approach 2
        System.out.println("Approach 2-without using temp");
        String str2 = "bubble";
        char [] str2arr =str2.toCharArray();
        Arrays.sort(str2arr);
        System.out.println(new String(str2arr));
    }
}
