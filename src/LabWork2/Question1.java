package LabWork2;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, y1, x2, y2;

        System.out.print("Enter the x coordinate of the first point: ");
        x1 = input.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        y1 = input.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        x2 = input.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        y2 = input.nextInt();

        System.out.printf("\nThe Manhattan Distance between (%d,%d) and (%d,%d) is %d",
                            x1, y1, x2, y2, (Math.abs(x1-y1) + Math.abs(x2-y2)) );
    }
}
