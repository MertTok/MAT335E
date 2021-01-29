package LabWork10;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> fibonacci = new ArrayList<Integer>();
        int n, k, subtotal;

        try
        {
            System.out.print("Enter n:");
            n = input.nextInt();

            System.out.print("Enter k:");
            k = input.nextInt();

            if(n < 0 || k < 2){
                throw new IllegalArgumentException("n has to be positive and k can not be smaller than 2.");
            }
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }

        for(int i = 0; i < k - 1; i++){ // 0 k-2
            fibonacci.add(0);
        }

        fibonacci.add(1); //1 k-1

        for(int i = k; i < n; i++) // 2 k
        {
            subtotal = 0;
            for(int j = i-1; j >= i-k; j--) // j=2, i-k = 0, j=
            {
                subtotal += fibonacci.get(j);
            }
            fibonacci.add(subtotal);
        }

        System.out.println( "Number with index " + n + " is: " + fibonacci.get(fibonacci.size() - 1) );

        System.out.print(k + "-fibonacci sequence: ");
        for(int i = 0; i < fibonacci.size(); i++){
            System.out.print(fibonacci.get(i) + " ");
        }
    }
}
