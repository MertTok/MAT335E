package LabWork5;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer to decide if it is a perfect number or not: ");
        number = input.nextInt();

        if(isPerfectNumber(number)) System.out.println(number + " is a perfect number.");
        else System.out.println(number + " is not a perfect number.");
    }

    public static boolean isPerfectNumber(int number){
        int total = 0;

        for(int i = 1; i <= number/2; i++){
            if(number % i == 0) total += i;
        }

        return number == total;
    }
}
