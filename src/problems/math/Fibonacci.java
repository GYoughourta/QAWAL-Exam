package problems.math;

import java.util.Scanner;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */
    static int F(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return (F(n-1) + F(n-2));
    }
    public static void main(String[] args) {

        int x = 0, j;


        System.out.println(("Les 30 premiers termes de la série de Fibonacci sont: "));

        for (j = 1; j <= 30; j++){
            System.out.println(F(x));
            x++;
        }


    }
}
