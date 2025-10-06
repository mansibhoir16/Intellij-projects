package PracticeSet5;

import java.util.Scanner;

public class factorialGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int inputNo = sc.nextInt();
        int fact = 1;
        //Using For loop
       /* for(int i =1; i<=inputNo; i++) {
            fact = fact * i;
        }
        */

        int i =1;
        //Using while loop
        while(i<=inputNo){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+inputNo +" is: " +fact);
    }

}
