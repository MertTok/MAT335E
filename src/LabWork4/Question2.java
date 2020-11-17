package LabWork4;

public class Question2 {

    public static void main(String[] args){

        Invoice phones = new Invoice("37827", "Samsung Galaxy S7", 100, -2500);
        Invoice adaptors = new Invoice("37935", "Lenovo Adaptors", 10, 68.75);

        System.out.print("Invoice ID: " + phones.getID() +
                         "\nDescription: " + phones.getDescription() +
                         "\nAmount: " + phones.getAmount() +
                         "\nPrice Per Item: " + phones.getPPI() +
                         "\nTotal Invoice Cost: " + phones.calculateInvoice() );

        System.out.print("\n---------------------------------------------------\n");

        System.out.print("Invoice ID: " + adaptors.getID() +
                         "\nDescription: " + adaptors.getDescription() +
                         "\nAmount: " + adaptors.getAmount() +
                         "\nPrice Per Item: " + adaptors.getPPI() +
                         "\nTotal Invoice Cost: " + adaptors.calculateInvoice() );
    }
}
