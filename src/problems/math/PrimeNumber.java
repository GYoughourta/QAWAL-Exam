package problems.math;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        int c, cpt = 0;
        for(int number = 1; number <= 1000000; number++)
        {
            c = 0;
            for (int i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    c++;
                    break;
                }
            }

            if(c == 0 && number != 1 )
            {
                cpt++;

            }
        }
        System.out.println("Prime Numbers from 1 to 1000000 is: " + cpt);

    }
}
