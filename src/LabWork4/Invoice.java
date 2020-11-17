package LabWork4;

public class Invoice {
    private String ID;
    private String description;
    private int amount;
    private double PPI;

    Invoice(String ID, String description, int amount, double PPI){
        setID(ID);
        setDescription(description);
        setAmount(amount);
        setPPI(PPI);
    }

    public String getID(){
        return this.ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public double getPPI(){
        return this.PPI;
    }

    public void setPPI(double PPI){
        this.PPI = PPI;
    }

    public double calculateInvoice(){
        if(getAmount() <= 0 || getPPI() <= 0) return 0;
        return getAmount() * getPPI();
    }
}
