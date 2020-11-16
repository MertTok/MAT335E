package LabWork3;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int input1, input2, input3;

        System.out.printf("Enter the first value: ");
        input1 = input.nextInt();
        System.out.printf("Enter the second value: ");
        input2 = input.nextInt();
        System.out.printf("Enter the third value: ");
        input3 = input.nextInt();

        if(hasMidpoint(input1, input2, input3)) System.out.printf("\nThe sets of points include a middle point.");
        else System.out.printf("\nThe sets of points does not include a middle point.");
    }

    public static boolean hasMidpoint(int p1, int p2, int p3)
    {
        int biggest = Math.max(p1, Math.max(p2, p3));
        int smallest = Math.min(p1, Math.min(p2, p3));

        if(p1 != biggest && p1 != smallest && p1 == (biggest+smallest)/2) return true;
        if(p2 != biggest && p2 != smallest && p2 == (biggest+smallest)/2) return true;
        if(p3 != biggest && p3 != smallest && p3 == (biggest+smallest)/2) return true;
        return false;
    }
}
