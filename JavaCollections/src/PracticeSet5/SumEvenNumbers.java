package PracticeSet5;

public class SumEvenNumbers {
    public static void main(String[] args) {
        //Print first 5 even numbers using while loop

        int n =5;
        int i =1;
        int sum =0;

       /* while(i<=n){
            sum = sum + (2*i);  //2+4+6+8+10
            i++;
        }*/

        //Using for loop

        for(int j =1; j<=n; j++){
            sum = sum+ (2*j);

        }
        System.out.println("Sum of first five even numbers using while loop is:"+sum);
    }
}
