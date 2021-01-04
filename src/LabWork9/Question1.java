package LabWork9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question1 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Movie LOTR = new Movie("The Lord of The Rings Trilogy", "123456789", MovieType.Regular);

        // Should throw an exception
        Rental yearlyLotrSession = new Rental(LOTR, format.parse("11-01-2020"), format.parse("10-01-2020"));

        // Should work fine
        yearlyLotrSession = new Rental(LOTR, format.parse("01-01-2020"), format.parse("10-01-2020"));
    }
}
