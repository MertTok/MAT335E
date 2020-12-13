package PracticeQuestions;
import java.util.Scanner;
import java.security.SecureRandom;

public class Question3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowestBound = 0, highestBound = 100, guessingAttempts = 0 ,secret, guess, guessResult;

        // Tell us your secret!
        System.out.println("Enter your secret number!");
        System.out.print("Your secret is: ");
        secret = input.nextInt();

        do
        {
            System.out.println("\nMake a guess!");
            guess = getRandomNumberBetween( lowestBound, highestBound );
            System.out.println("Your guess: " + guess);

            guessResult = checkGuess( secret,  guess);
            guessingAttempts++;

            if( guessResult == 1 ) {
                System.out.println("Guess higher!");
                lowestBound = guess + 1;
            }
            else if( guessResult == -1 ) {
                System.out.println("Guess lower!");
                highestBound = guess - 1;
            }
        }
        while(guessResult != 0);

        System.out.println("You have guessed the right number!");
        System.out.println("It took you " + guessingAttempts + " times to guess the number " + secret);

    }

    public static int checkGuess(int actualNumber, int guess){
        if( actualNumber < guess) return -1;
        else if( actualNumber > guess) return 1;
        return 0;
    }

    public static int getRandomNumberBetween(int lowest, int highest){
        SecureRandom randomNumbers = new SecureRandom();
        return randomNumbers.nextInt( highest + 1 - lowest ) + lowest;
    }
}
