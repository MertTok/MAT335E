package LabWork5;

public class ISBN {
    private long ISBN;
    private boolean isValid;

    ISBN(long ISBN){
        this.ISBN = ISBN;
        this.validate();
    }

    // Getters and Setters
    public long getISBN(){
        return ISBN;
    }

    public void setISBN(long ISBN){
        this.ISBN = ISBN;
    }

    public boolean getIsValid(){
        return isValid;
    }

    public void setIsValid(boolean isValid){
        this.isValid = isValid;
    }

    // Helper Methods
    public void validate(){
        int total = 0;

        // If the provided number is not 11 digits, it is not a valid ISBN
        if( (ISBN / Math.pow(10,10)) < 1 || (ISBN / Math.pow(10,10)) > 10 ){
            System.out.println("This ISBN value is not valid. ISBN value must be 11 digits.");
            setIsValid(false);
            return;
        }

        // Check modular validity condition
        for(int i = 2; i <= 11; i++) total += getNthDigit(ISBN, i) * (i-1);

        setIsValid(total % 10 == ISBN % 10);
    }

    public int getNthDigit(long number, int n){
        return (int) ((number / Math.pow(10, n-1)) % 10);
    }
}
