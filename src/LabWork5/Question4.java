package LabWork5;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long ISBN_val;

        // Read ISBN value
        System.out.print("Enter ISBN value: ");
        ISBN_val = input.nextLong();
        ISBN articleISBN = new ISBN(ISBN_val);

        // Print out validity information about the ISBN
        if(articleISBN.getIsValid()) System.out.println("ISBN is valid.");
        else System.out.println("ISBN is not valid.");
    }
}