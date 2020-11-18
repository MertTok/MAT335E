package LabWork2;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;

        System.out.print("Enter an integer: ");
        val = input.nextInt();

        if(isHilbertNumber(val)) System.out.println("This number is a Hilbert Number.");
        else System.out.println("This number is not a Hilbert Number");
    }

    public static boolean isHilbertNumber(int number){
        return (number - 1) % 4 == 0;
    }
}
