package problems.string;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */
    public static boolean Anagram(String str2, String str1) {
        if (str2.length() != str1.length())
            return false;

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            int index = str1.indexOf(c);
            if (index != -1) {
                str1 = str1.substring(0, index) + str1.substring(index + 1);
            } else
                return false;
        }
        return str1.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("First word: ");
        String str1 = (sc.nextLine());
        System.out.println("Second word: ");
        String str2 = (sc.nextLine());

        if (Anagram(str1, str2))
            System.out.println(str1+" and "+str2+" are anagrams");
        else
            System.out.println(str1+" and "+str2+" are not anagrams");

    }

}
