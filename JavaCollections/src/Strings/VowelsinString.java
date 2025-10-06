package Strings;

public class VowelsinString {
    public static void main(String[] args) {

        //Print vowels in a string

        String inputstr = "Hello India";

        inputstr = inputstr.toLowerCase();

        int length = inputstr.length();

        for(int i=1; i<length; i++){
            char ch = inputstr.charAt(i);

            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' ||ch =='u'){
                System.out.println(ch + " ");

            }
        }


    }
}
