package Homework2;
import java.util.Scanner;

public class EncryptionTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long EncryptedText, Key;

        //////////////////////////////// Manual Testing ////////////////////////////////
        Encryption x1 = new Encryption(749711897, 2232);
        System.out.println(x1.decrypt());

        Encryption x2 = new Encryption(831179999101115115L, 2322333);
        System.out.println(x2.decrypt());

        Encryption x3 = new Encryption(729711410510797L, 223332);
        System.out.println(x3.decrypt());

        Encryption x4 = new Encryption(729711410510797L, 2232);

        Encryption x5 = new Encryption(729711410510797L, 223642);
        ////////////////////////////// Testing ends here ///////////////////////////////

        System.out.print("\nEnter the encrypted text: ");
        EncryptedText = input.nextLong();

        System.out.print("Enter the key: ");
        Key = input.nextLong();

        System.out.println( new Encryption(EncryptedText, Key).decrypt() );
    }
}