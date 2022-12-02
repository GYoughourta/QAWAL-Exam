package problems.string;

import java.util.Scanner;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */

    static void Permutation(String str, String str2)
    {

        if (str.length() == 0) {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String word = str.substring(0, i) + str.substring(i + 1);
            Permutation(word, str2 + str.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the word: ");
        String str = (sc.nextLine());
        Permutation(str, "");
    }
}