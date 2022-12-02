package problems.math;

import java.util.Scanner;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("données la valeur que vous cherchez:");
        int x = sc.nextInt();
        int fact = factorial(x);
        System.out.println("Factorial de "+x+" est: "+fact);


    }

}
