package LabWork4;
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

        System.out.print("The points yield " + TriangleType(input1, input2, input3) + " triangle.");
    }

    public static String TriangleType(int edge1, int edge2, int edge3){
        if( edge1 == edge2 && edge2 == edge3 ) return "equilateral";
        else if (edge1 != edge2 && edge2 != edge3 && edge3 != edge1) return "scalene";
        return "isosceles";
    }
}
