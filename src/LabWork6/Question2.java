package LabWork6;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double real, imag;

        System.out.println("Enter the first complex number:");
        real = input.nextDouble();
        imag = input.nextDouble();
        ComplexNumber z1 = new ComplexNumber(real, imag);

        System.out.println("Enter the second complex number:");
        real = input.nextDouble();
        imag = input.nextDouble();
        ComplexNumber z2 = new ComplexNumber(real, imag);

        System.out.println( "z1 + z2 = " + ComplexNumber.add(z1, z2).ComplexNumberToString() );
        System.out.println( "z1 * z2 = " + ComplexNumber.multiply(z1,z2).ComplexNumberToString() );
    }
}
