package LabWork3;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float x1, x2, x3;

        System.out.print("Enter the first value: ");
        x1 = input.nextInt();
        System.out.print("Enter the second value: ");
        x2 = input.nextInt();
        System.out.print("Enter the third value: ");
        x3 = input.nextInt();

        System.out.print(findRoots(x1, x2, x3));
    }

    public static String findRoots(float x1, float x2, float x3)
    {
        float delta = x2 * x2 - 4 * x1 * x3;

        if(delta > 0){
            double root1 = (-x2 + Math.sqrt(delta)) / (2 * x1);
            double root2 = (-x2 - Math.sqrt(delta)) / (2 * x1);
            return "The equation has two roots " + root1 + " and " + root2;
        }
        else if(delta == 0){
            double root = -x2 / (2 * x1);
            return "The equation has a single root " + root;
        }

        return "The equation has no roots";
    }
}
