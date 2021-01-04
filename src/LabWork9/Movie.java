package LabWork9;

public class Movie {
    String title;
    String barcode;
    MovieType type;

    Movie(String title, String barcode, MovieType type){
        this.title = title;
        this.barcode = barcode;
        this.type = type;
    }

    public MovieType getType(){
        return this.type;
    }

    public double getDailyPrice(double exchangeRate){
        return type.rentalPrice * exchangeRate;
    }

}
