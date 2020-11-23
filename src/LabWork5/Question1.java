package LabWork5;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, sum;

        System.out.print("Enter the starting value: ");
        start = input.nextInt();

        System.out.print("\nEnter the final value: ");
        end = input.nextInt();

        sum = primesBetween(start, end);
        System.out.println("\nThe sum of prime numbers between " + start + " and " + end + " are: " + sum);

    }

    public static int primesBetween(int start, int end){
        int total = 0;

        for(int number = start+1; number < end; number++)
        {
            if(isPrime(number)) total += number;
        }

        return total;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++)
        {
            if(number%i == 0) return false;
        }
        return true;
    }
}
