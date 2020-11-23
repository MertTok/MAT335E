package LabWork5;
import java.util.Scanner;

public class Question2a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEntries, val, total = 0;
        float harmonicAverage;

        System.out.print("How many numbers will you enter?: ");
        numberOfEntries = input.nextInt();

        for(int i = 1; i <= numberOfEntries; i++){
            System.out.print("\nEnter a value: ");
            val = input.nextInt();
            total += val;
        }

        harmonicAverage = (float) numberOfEntries / total;

        System.out.println("The harmonic average is: " + harmonicAverage);
    }
}
