package Strings;

public class ReverseFirstAlpahabet {
    public static void main(String[] args) {
        //Make the first character of word in string as capital letter?
        //input: how are you?

        String inputstr= "how are you?";
        String [] str = inputstr.split(" ");

        String result = "";

        for(String word: str){
            result = result + word.substring(0,1).toUpperCase()+
                    word.substring(1)+" ";
        }
        System.out.println(result.trim());
    }
}
