package LabWork8;

public class Person {
    private String name;
    private String tcNo;
    private Aquarium aquarium;
    private Cat cat;

    Person(String name, String tcNo){
        this.name = name;
        this.tcNo = tcNo;
    }

    Person(String name, String tcNo, Aquarium aquarium){
        this.name = name;
        this.tcNo = tcNo;
        this.aquarium = aquarium;
    }

    Person(String name, String tcNo, Cat cat){
        this.name = name;
        this.tcNo = tcNo;
        this.cat = cat;
    }

    Person(String name, String tcNo, Aquarium aquarium, Cat cat){
        this.name = name;
        this.tcNo = tcNo;
        this.aquarium = aquarium;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void introduceYourself(){

        // Person tells their name
        System.out.println("\nHi, my name is " + getName());

        // Person talks about their fish, if they have any
        try
        {
            System.out.println("I have an aquarium with " + aquarium.getNumberFish() + " fish in it.");
        }
        catch(Exception e)
        {
            System.out.println("I don't have any fish");
        }

        // Person talks about their cat, if they have one
        try
        {
            System.out.println("I have a cat, its name is " + cat.getName());
        }
        catch(Exception e)
        {
            System.out.println("I don't have a cat. I wish I had one though!");
        }
    }
}
