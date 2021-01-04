package LabWork9;
import java.util.Date;

public class Rental {
    Movie movie;
    Date rentalDate;
    Date dueDate;

    public Rental(Movie movie, Date rentalDate, Date dueDate){
        try
        {
            System.out.println("\nAttemting to rent a movie...");
            if( dueDate.before(rentalDate) )
            {
                throw new IllegalArgumentException("Due date can not be before rental date.");
            }
            this.movie = movie;
            this.rentalDate = rentalDate;
            this.dueDate = dueDate;

            System.out.println("Successfully rented a movie.");
            System.out.println("You rented: " + movie.title);
            System.out.println("Rental Date: " + rentalDate);
            System.out.println("Due Date: " + dueDate + "\n");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
