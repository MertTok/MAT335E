package PracticeQuestions;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, d;

        System.out.print("Enter an integer value: ");
        k = input.nextInt();

        System.out.print("Enter the digit you are looking for: ");
        d = input.nextInt();

        // PART A Begins
        if( d < 0 || d > 10)
        {
            System.out.println("You must enter a value between 0 and 10!");
            return;
        }

        Object result = find_digit(k, d);

        if( result instanceof Boolean ) System.out.println( d + " is not found in " + k);
        else System.out.println(d + " is found in position " + result);
        // PART A Ends

        // PART B Begins
        System.out.println("Digit sum of " + k + " is " + digit_sum(k));
        // PART B Ends

        // PART C Begins
        System.out.println("Valid digit sum of " + k + " is " + check_sum(k));
        // PART C Ends
    }

    public static Object find_digit(int k, int d){
        char [] numberArray = Integer.toString(k).toCharArray();

        for(int i = 0; i < numberArray.length; i++){
            if( Integer.parseInt(String.valueOf(numberArray[i])) == d) return numberArray.length - 1 - i;
        }

        return false;
    }

    public static int digit_sum(int k){
        char [] charArray = Integer.toString(k).toCharArray();
        int sum = 0;

        for(int i = 0; i < charArray.length; i++)
        {
            int digitValue = (charArray[charArray.length - 1 - i] - '0') * (i % 2 + 1);
            if(digitValue > 9) digitValue = (digitValue / 10) + (digitValue % 10);
            sum += digitValue;
        }

        return sum;
    }

    public static int check_sum(int k){
        if( digit_sum(k) % 10 == 0) return k;

        int newNumber = k * 10;

        return (newNumber + 10 - (digit_sum(newNumber) % 10));
    }
}
