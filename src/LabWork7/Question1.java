package LabWork7;
import java.util.Scanner;
import java.security.SecureRandom;

public class Question1 {

    static int numberOfPieces = 3;

    public static void main(String[] args) {
        // Declare variables
        Scanner input = new Scanner(System.in);
        int[] pieces = new int[3];
        int remainingLength = 0;

        // Ask for user input
        System.out.print("Enter the length of the wire: ");
        remainingLength = input.nextInt();

        // Assign a value to each piece
        for(int i = 0; i < numberOfPieces-1; i++){
            pieces[i] = getRandomNumberBetween(10, (int) Math.floor(remainingLength * 0.8) );
            remainingLength -= pieces[i];
        }
        pieces[numberOfPieces-1] = remainingLength;

        // Print length values for each piece
        for(int i = 0; i < 3; i++) System.out.println("Piece " + i + "'s length is " + pieces[i]);

        // Check if pieces form a triangle
        if(piecesFormATriangle(pieces[0], pieces[1], pieces[2])) System.out.println("Pieces form a triangle");
        else System.out.println("Pieces do not form a triangle.");
    }

    public static int getRandomNumberBetween(int lowest, int highest){
        SecureRandom randomNumbers = new SecureRandom();
        return randomNumbers.nextInt( highest + 1 - lowest ) + lowest;
    }

    public static boolean piecesFormATriangle(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
