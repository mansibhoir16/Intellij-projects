package ArrayPrograms;
import java.util.*;
public class ArrayAll {

    public static void main(String[] args) {
        int arr[] = {12, 67, 34, 78, 23};
        int arrsize = arr.length;
        //Sort the Array
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " "); // [12,23,34,67,78]
        }
        System.out.println();
        //Largest Number will be n-1
        int LargestNo = arr[arrsize - 1];
        System.out.println("Largest No is :" + LargestNo);
        //Smallest Number will be arr[0]
        System.out.println();
        int SmallestNo = arr[0];
        System.out.println("Smallest No is :" + SmallestNo);

        //Second Largest Number

        for (int i = arrsize - 2; i > 0; i--) {

            if (arr[i] < LargestNo) {
                System.out.println("Second Largest Number is: " + arr[i]);
                break;
            }

        }


    }
}