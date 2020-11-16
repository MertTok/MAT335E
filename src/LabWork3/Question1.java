package LabWork3;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int input1, input2, input3;

        System.out.print("Enter the first value: ");
        input1 = input.nextInt();
        System.out.print("Enter the second value: ");
        input2 = input.nextInt();
        System.out.print("Enter the third value: ");
        input3 = input.nextInt();

        if(hasMidpoint(input1, input2, input3)) System.out.print("\nThe sets of points include a middle point.");
        else System.out.print("\nThe sets of points does not include a middle point.");
    }

    public static boolean hasMidpoint(int p1, int p2, int p3)
    {
        double biggest = Math.max(p1, Math.max(p2, p3));
        double smallest = Math.min(p1, Math.min(p2, p3));
        double midpoint = (biggest + smallest) / 2;

        return (p1 == midpoint || p2 == midpoint || p3 == midpoint);
    }
}
