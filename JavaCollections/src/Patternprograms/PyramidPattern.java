package Patternprograms;

public class PyramidPattern {
    public static void main(String[] args) {


        int rows = 5;
        //5 is odd number for center it will be odd number 2*i-1

        for (int i = 1; i <= rows; i++) {

            //Print spaces
            for(int j=i; j< rows; j++){
                System.out.print(" ");
            }
            //Print Star
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
                //Instead of stars if you want to print nos use the below line
                //System.out.print(k);
            }
            System.out.println();

        }
    }
}
