package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";
        String[] words = new String[100];
        String word="", wordlongest="";
        str = str+" ";

        int taille=0;
        int length=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            }else{
                words[length] = word;
                length++;
                word = "";
            }
        }
        wordlongest=words[0];
        for (int i=0; i<length;i++){
            if(words[i].length()>taille){
                taille= words[i].length();
                wordlongest = words[i];
            }
        }
        System.out.println("the length word: "+wordlongest+" his length is: "+taille);
    }

}
