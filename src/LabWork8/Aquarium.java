package LabWork8;

public class Aquarium {
    private int numberFish;

    public Aquarium(int numberFish){
        this.numberFish = numberFish;
    }

    // Getters & Setters
    public int getNumberFish() {
        return numberFish;
    }

    public void setNumberFish(int numberFish) {
        this.numberFish = numberFish;
    }

    public boolean addFish(){
        setNumberFish(getNumberFish() + 1);
        return true;
    }

    public boolean removeFish(int amount){
        try
        {
            if(getNumberFish() - amount < 0)
            {
                throw new ArithmeticException("There aren't enough fishes in the aquarium.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        setNumberFish(getNumberFish() - amount);
        return true;
    }

    public boolean removeFish(){
        try
        {
            if(getNumberFish() < 0)
            {
                throw new ArithmeticException("There aren't enough fishes in the aquarium.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        setNumberFish(getNumberFish() - 1);
        return true;
    }

}
