package LabWork2;
import java.util.Scanner;

public class Question3 {

    static float center_x = 2, center_y = 4, radius = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x1, y1;

        System.out.print("The x coordinate of the point is: ");
        x1 = input.nextFloat();
        System.out.print("The y coordinate of the point is: ");
        y1 = input.nextFloat();

        System.out.println("The point lies " + isInsideCircle(x1, y1) + " the circle.");
    }

    public static String isInsideCircle(float x1, float y1){
        float result = ((x1 - center_x) * (x1 - center_x) + (y1 - center_y) * (y1 - center_y));

        if(result == radius * radius) return "on";
        else if (result < radius * radius) return "inside";
        return "outside";
    }
}
