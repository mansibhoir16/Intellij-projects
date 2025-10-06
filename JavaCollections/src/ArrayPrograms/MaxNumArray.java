package ArrayPrograms;
 import java.util.*;
public class MaxNumArray {
    public static void main(String[] args) {
        int arr[] ={12,45,10,6,30,50};

        Arrays.sort(arr);
        //[ 6, 10, 12, 30, 45, 50 ]
        int n = arr.length;
        int largest = arr[n-1];
        int secondlargest = -1;
        for(int i =n-2; i>=0; i--){

            if(arr[i] < largest){
                secondlargest = arr[i];
                break;
            }
        }

        if(secondlargest == -1){
            System.out.println("No second largest number found");
        }
        else{
            System.out.println("second largest number found: "+secondlargest);
        }

    }

}
