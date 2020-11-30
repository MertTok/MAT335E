package LabWork6;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return this.real;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getImag(){
        return this.imag;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public static ComplexNumber conjugate(ComplexNumber z){
        return new ComplexNumber(z.getReal(), -z.getImag());
    }

    public static double absValue(ComplexNumber z){
        return Math.sqrt( z.getReal()*z.getReal() + z.getImag()*z.getImag());
    }

    public static ComplexNumber add(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber(z1.getReal() + z2.getReal(), z1.getImag() + z2.getImag());
    }

    public static ComplexNumber multiply(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber( (z1.getReal()*z2.getReal() - z1.getImag()*z2.getImag()), (z1.getImag()*z2.getReal() + z1.getReal()*z2.getImag()) );
    }

    public String ComplexNumberToString(){
        return this.getReal() + " " +  this.getImag() + "i";
    }
}
