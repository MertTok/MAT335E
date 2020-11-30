package LabWork6;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.print("Enter the first value: ");
        x = input.nextInt();

        System.out.print("Enter the second value: ");
        y = input.nextInt();

        for(int i = x; i <= y; i++)
        {
            switch(i){
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                default:
                    if( i % 2 == 0) System.out.println("Even");
                    else System.out.println("Odd");
                    break;
            }
        }
    }
}
