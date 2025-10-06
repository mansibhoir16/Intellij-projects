package Collections;
import java.util.Scanner;
public class CustomExeception {


    public static void main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You are eligible to vote");
        }
        try {
            if (age < 18) {
                throw new Exception("You are not eligible to vote");

            }
        }catch(Exception e){
            System.out.print("Exception: "+e.getMessage());

        }

    }
}
