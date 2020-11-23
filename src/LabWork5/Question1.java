package LabWork5;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end;

        System.out.println("Enter the starting value:");
        start = input.nextInt();

        System.out.println("Enter the final value:");
        end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        primesBetween(start, end);
    }

    public static void primesBetween(int start, int end){
        for(int number = start+1; number < end; number++)
        {
            if(isPrime(number)) System.out.println(number);
        }
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++)
        {
            if(number%i == 0) return false;
        }
        return true;
    }
}
