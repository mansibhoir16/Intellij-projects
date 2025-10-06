package Strings;

public class ReverseNumber {
    public static void main(String[] args) {

        //Using StringBuilder function

        int input = 12345;

        int reversed = 0;

        while(input != 0){
           int rem = input % 10;  //fetch last digit 5%10 = 5
            reversed = reversed*10 +rem; //Append last digit to reversed no 0*10 +5 = 5
            input = input/10; //remove last digit 5/10
        }

    }
}
