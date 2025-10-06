package Strings;

public class ReplaceVowels {
    public static void main(String args[]){
        String str = "Welcome to India";

        String inputstr = str.replaceAll("(?i)[aeiou]","*");
        System.out.println(inputstr);

    }
}
