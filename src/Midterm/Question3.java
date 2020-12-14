////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Midterm;
import java.util.Scanner;

public class Question3 {
    private static final double wakeupTreshold = 30;
    private static final double maleNarcosisLoss = 0.028;
    private static final double femaleNarcosisLoss = 0.026;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender;
        double durationOfSurgery;

        System.out.print("Please enter the gender of patient (Male/Female): ");
        gender = input.nextLine();

        System.out.print("Please enter the duration of surgery (hour): ");
        durationOfSurgery = input.nextDouble();

        Narcosis(durationOfSurgery, gender);
    }

    public static void Narcosis(double duration, String gender){
        double lossPerMinute, effectiveness = 100;
        int doses = 1, durationInMinutes = (int) Math.ceil(60 * duration);

        // Check for gender
        if(gender.equals("male"))
        {
            lossPerMinute = maleNarcosisLoss;
        }
        else if (gender.equals("female"))
        {
            lossPerMinute = femaleNarcosisLoss;
        }
        else
            {
            System.out.println("Enter a valid gender.");
            return;
        }

        // Check effectiveness minute by minute
        for(int minute = 0; minute <= durationInMinutes; minute++)
        {
            effectiveness -= effectiveness * lossPerMinute;

            if(effectiveness < wakeupTreshold)
            {
                doses++;
                effectiveness = 100;
            }

            System.out.format("\nMinute: %2d Effectiveness: %12.10f Dose: %2d", minute, effectiveness, doses);
        }
    }
}
