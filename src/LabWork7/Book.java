package LabWork7;

public class Book {
    private String name;
    private String author;
    private double price;
    private int quantityInStock;

    public Book(String name, String author, double price, int quantityInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this. quantityInStock = quantityInStock;
        bookStockInfo();
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantityInStock(){
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }

    public void bookStockInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity in stock: " + getQuantityInStock());
    }

    public boolean hasEnoughStock(int amount){
        if(getQuantityInStock() < amount)
        {
            System.out.println("-----------------------------------------");
            System.out.println("Not enough items in stock for '" + getName() + "'.");
            System.out.println("Requested amount: " + amount);
            System.out.println("Available stock: " + getQuantityInStock());
            return false;
        }
        return true;
    }

    public boolean sellBook(){
        if( !hasEnoughStock(1) ) return false;

        setQuantityInStock( getQuantityInStock() - 1 );
        System.out.println("A book was sold.");
        bookStockInfo();
        return true;
    }

    public boolean sellBook(int amount){
        if( !hasEnoughStock(amount) ) return false;

        setQuantityInStock( getQuantityInStock() - amount );
        bookStockInfo();
        System.out.println(amount + " books were sold.");
        return true;
    }
}
