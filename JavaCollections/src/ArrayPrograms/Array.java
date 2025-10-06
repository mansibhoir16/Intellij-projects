package ArrayPrograms;

public class Array {
    public static void main(String[] args) {

        int arr [] ={11,24,27,98,67,45};
        int size = arr.length;

        //Print contents of array
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Array in reverse order");
        //Print content of array in reverse order
        for(int j=size-1; j>0; j--){
            System.out.println(arr[j]);
        }
        System.out.println("Print Array using for each loop");
        //Print using For each loop
        for(int element : arr){
            System.out.println(element);
        }
    }
}
