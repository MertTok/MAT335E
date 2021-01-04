package LabWork9;

public enum MovieType {
    Regular("Regular", 1.5),
    NewRelease("New Release", 2.0),
    Childrens("Children's", 1.0);

    public final String label;
    public final double rentalPrice;

    private MovieType(String label, double rentalPrice){
        this.label = label;
        this.rentalPrice = rentalPrice;
    }

    public double getRentalPrice(){
        return this.rentalPrice;
    }
}
