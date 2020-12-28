package LabWork8;

public class DrivingSchool {
    private String name;
    private double price;

    public DrivingSchool(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        try
        {
            if(price < 0)
            {
                throw new ArithmeticException("Price has to be a positive value.");
            }
            this.price = price;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public boolean Register(int age){
        try
        {
            if(age < 18)
            {
                throw new ArithmeticException("Person who is registering must be older than 18");
            }

            System.out.println("Registration was successful.");
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }

}
