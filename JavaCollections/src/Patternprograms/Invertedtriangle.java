package Patternprograms;

public class Invertedtriangle {

    public static void main(String[] args) {
        int rows = 5;

        for(int i =rows; i>0; i--){ //54321

            for(int j=1 ; j<=i; j++){   //Print stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
