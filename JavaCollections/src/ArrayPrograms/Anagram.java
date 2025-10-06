package ArrayPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Anagrams
        //Length should be same
        //characters should be same
        String s1 = "listen";
        String s2 ="silent";

        int lens1 = s1.length();
        int lens2 = s2.length();

        if(lens1 == lens2){
            System.out.println("It is anagram");
        }
        char arrs1[] = s1.toCharArray();
        char arrs2[] = s2.toCharArray();

        Arrays.sort(arrs1);
        Arrays.sort(arrs2);
        Arrays.equals(arrs1,arrs2);

    }
}
