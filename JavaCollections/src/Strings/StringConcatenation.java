package Strings;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("How");
        words.add(" ");
        words.add("are");
        words.add(" ");
        words.add("you");
        StringBuilder concatstr =new StringBuilder();
        for(String word : words){
            concatstr.append(word);
        }
        System.out.println("Concatinated String is: "+ concatstr);

    }
}
