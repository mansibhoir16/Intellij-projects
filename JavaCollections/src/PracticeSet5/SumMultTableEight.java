package PracticeSet5;

public class SumMultTableEight {
    public static void main(String[] args) {
        //WAP to cal sum of nos occuring in the multiplication table of 8

        int num =8;

        int sum = 0;
        for(int i =1; i<=10; i++){
            sum = sum + (i*num);
        }
        System.out.println("Sum of Numbers occuring in multiplication of table of 8 is: "+sum);
    }
}
