package LabWork1;

public class Question5 {

    public static void main(String[] args){
        double pi = 3.14;
        double totalVolume = (pi * 2 * 2 * 10);
        double emptyVolume = totalVolume - 100;
        double ballVolume  = (4.0 / 3.0) * pi * 1.5 * 1.5 * 1.5;

        System.out.printf("Overflowing volume of water is %.2f cm cube", (3 * ballVolume - emptyVolume));
    }
}
