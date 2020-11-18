package LabWork1;

public class Question4 {

    public static void main(String[] args){
        double Kelvin, Fahrenheit;

        System.out.printf("62 Fahrenheit is %.2f Kelvin.\n", fahrenheitToKelvin(62));
        System.out.printf("230 Kelvin is %.2f Fahrenheit.", kelvinToFahrenheit(230));
    }

    public static double kelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 1.8 + 32;
    }

    public static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit - 32) / 1.8 + 273.15;
    }
}
