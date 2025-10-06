package ArrayPrograms;

import java.util.Arrays;

public class MergedArray {

    public static void main(String[] args) {

        int arr1 [] = { 1,2 ,3 ,4 ,5};
        //Find legth of arr1
        int sizearr1 =arr1.length;
        int arr2 [] = { 6,7 ,8 ,9 ,10};
        //Find legth of arr2
        int sizearr2 =arr2.length;
        //Define mergesdarray
        int mergedarr[] = new int [sizearr1 + sizearr2];

        for(int i =0; i< sizearr1 ; i++){
            mergedarr[i] = arr1[i];
        }

        for(int i =0; i< sizearr2 ; i++){
            mergedarr[sizearr1 + i] = arr2[i];
        }

        System.out.println(Arrays.toString(mergedarr));

    }
}
