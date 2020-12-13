package PracticeQuestions;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter an integer value:");
        n = input.nextInt();

        if(spiral(n)) System.out.println("n contains a spiral number.");
        else System.out.println("n does not contain a spiral number;");
    }

    public static boolean spiral(int n){
        char [] numberArray = Integer.toString(n).toCharArray();

        for(int i = 1; i < numberArray.length - 1; i++){
            if(numberArray[i-1] == numberArray[i+1]) return true;
        }

        return false;
    }
}
