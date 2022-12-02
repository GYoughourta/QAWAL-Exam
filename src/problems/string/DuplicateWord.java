package problems.string;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";

        int cpt;
        double moy = 0;

        String words[] = str.split(" ");
        for(int i = 0; i < words.length; i++) {
            cpt = 1;
            moy += words[i].length();
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    cpt++;
                    words[j] = "*";
                }
            }

            if(cpt > 1 && words[i] != "*")
                System.out.println("words "+words[i]+" number of occurrences "+ cpt);
        }
        System.out.println("the average length of the words " + moy/words.length);

    }

}
