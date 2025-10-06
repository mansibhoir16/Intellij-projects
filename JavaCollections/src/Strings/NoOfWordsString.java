package Strings;

public class NoOfWordsString {

    public static void main(String args[]){
         String str = "How are you";
        String [] words = str.trim().split("\\s+");
        System.out.println("No of words in a string: "+words.length);

        //Explanation
        //.trim() - removes space if present before the first word and after the last word
        //  " \\s+ " means split wherever there is one or more consecutive whitespace characters.
    }
}
