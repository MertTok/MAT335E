package LabWork5;
import java.util.Scanner;

public class Question2a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int exitCondition = -1, val, total = 0, numberOfEntries = 0;
        float harmonicAverage;

        System.out.println("Enter " + exitCondition + " to exit.");

        while(true)
        {
            System.out.print("\nEnter a value: ");
            val = input.nextInt();

            if (val == exitCondition){
                System.out.println("Exiting the program...");
                break;
            }

            total += val;
            numberOfEntries++;
        }

        harmonicAverage = (float) numberOfEntries / total;

        System.out.println("The harmonic average is: " + harmonicAverage);
    }
}
