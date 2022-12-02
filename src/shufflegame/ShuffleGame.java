package shufflegame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame implements GameRoadMap{

    Scanner scanner = new Scanner(System.in);
    String c;

    int[] array = {1, 0 ,1};
    String mode;

    /**
     * method that takes an array shuffles the components in random way and returns it
     * @param array: array to shuffle
     * @return array: shuffled array
     */
    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     *
     * @return playerGuess: userInput value
     */
    public String playerGuess() {
        c = scanner.nextLine();
        while (!(c.equalsIgnoreCase("1")) && !(c.equalsIgnoreCase("2")) && !(c.equalsIgnoreCase("3"))){
            System.out.println("invalid entry, please enter 1, 2 or 3");
            c =scanner.nextLine();
        }
        return c;
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, String playerGuess) {

        if (array[Integer.parseInt(c)-1]==0)
            System.out.println("good guess!");
        else
            System.out.println("sorry!!! wrong guess");


    }



    /**
     * uses the previous functions in a good sequential way to run the game
     * uses the method recursion in order to loop in the game
     */
    public void play() {
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? y/n");
        mode = scanner.nextLine();
        while (!(mode.equalsIgnoreCase("y")) && !(mode.equalsIgnoreCase("n"))) {
            System.out.println("invalid entry, please enter yes or No");
            mode = scanner.nextLine();
        }
        if (mode.equalsIgnoreCase("y")) {
            array = shuffleGame(array);
            System.out.println("pick 1, 2 or 3!");
            c = playerGuess();
            checkGuess(array, c);

            System.out.println("do you want to try again? y/n");
            mode = scanner.nextLine();
            while (!(mode.equalsIgnoreCase("y")) && !(mode.equalsIgnoreCase("n"))) {
                System.out.println("invalid entry, please enter yes or No");
                mode = scanner.nextLine();
            }
            if (mode.equalsIgnoreCase("y"))
                play();
            else
                System.out.println("see you next time !");

        }
        else
            System.out.println("see you next time !");
    }


}
