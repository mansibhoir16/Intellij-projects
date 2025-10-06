package ArrayPrograms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={2,10,1,6,5,3};
        int size = arr.length;
        int temp =0;
        //no of elements
        for(int i=0; i<size; i++){

            //for swapping
            for(int j=0; j< size-1; j++){

                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        for(int nums: arr){
            System.out.print(nums + " ");
        }

    }

}
