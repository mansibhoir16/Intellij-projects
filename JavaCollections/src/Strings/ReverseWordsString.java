package Strings;

public class ReverseWordsString {
    public static void main(String[] args) {
        String str = "How are you";
        String []words = str.trim().split("\\s");
        System.out.println("No of words are: "+words.length);

        String WordReverse ="";
        //Reverse words of string
        for(int j= words.length-1; j>=0;j--){
            WordReverse = WordReverse + words[j] + " ";    //Iterations  j=2  you
                                                                        //j=1  you are
                                                                        //j=0 you are How
        }
        System.out.println("Reversed words: "+WordReverse.trim());      // you are How
    }
}
