import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random(); // for generating random numbers
        int randomNumber = rand.nextInt(100) + 1; // getting random numbers between 1 to 100
        // System.out.println("Random Number=" + randomNumber); This line is used to see
        // what the random number is!!!
        int count = 0;
        int max = 5;
        System.out.println("You have 5 tries to guess the correct answer");

        while (true) {
            System.out.println("Enter your guess(1-100): ");

            int playersGuess = 0;
            try {
                playersGuess = scn.nextInt();
                if (playersGuess < 1 || playersGuess > 100) {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                    continue;
                } // error handling
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scn.next(); // clear the invalid input
                continue;
            }

            count++;
            if (playersGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number :)");
                if (count == 1)
                    System.out.println("It took you " + count + " try to guess the correct number");
                else
                    System.out.println("It took you " + count + " tries to guess the correct number");
                break;
            } else if (playersGuess > randomNumber) {
                System.out.println("No, your guess is too high :(  Try again!!!");
            } else {
                System.out.println("No, your guess is too low :(  Try again!!!");
            }
            if (count == max) {
                System.out.println("You have reached the maximum number of attempts " + "(" + max
                        + ")   :(  Better Luck next time"); // only 5 attempts as we mentioned
                System.out.println("Game Over!!!");
                break;
            }
        }

        scn.close();
    }
}
