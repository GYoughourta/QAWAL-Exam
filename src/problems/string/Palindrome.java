package problems.string;

import java.util.Scanner;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */
    public static boolean isPalindrome(String str)
    {
        String str2 = "";
        boolean bool = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }

        if (str.equals(str2)) {
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give the word: ");
        String str1 = (sc.nextLine());

        if (isPalindrome(str1))
            System.out.println(str1+" is Palindrome ");
        else
            System.out.println(str1+" is not Palindrome ");

    }
}
