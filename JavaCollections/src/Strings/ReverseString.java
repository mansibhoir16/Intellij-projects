package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        //Using String Builder
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Using String Builder");
        System.out.println(reversed);
        //Without String Builder
        String reverse ="";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);

        }

        System.out.println(reverse);
    }
}
