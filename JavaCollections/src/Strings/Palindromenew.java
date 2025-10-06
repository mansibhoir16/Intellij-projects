package Strings;

public class Palindromenew {
    public static void main(String[] args) {
       String inputstr = "Dad";
       //convert to lowercase
        String str = inputstr.toLowerCase();
        String reverse = "";

        for(int i= str.length()-1; i>=0;i--){

            reverse = reverse + str.charAt(i);

        }
        //Using StringBuilder
      reverse = new StringBuilder(reverse).reverse().toString();
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }
    }
}
