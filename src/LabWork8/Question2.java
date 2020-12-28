package LabWork8;

public class Question2 {

    public static void main(String[] args) {

        // Create Person 1
        Person Mert = new Person("Mert Tok", "234234234");

        Aquarium mertsAquarium = new Aquarium(10);
        Cat mertsCat = new Cat("Tekir");

        Mert.setAquarium(mertsAquarium);
        Mert.setCat(mertsCat);


        // Create Person 2
        Aquarium smallAquarium = new Aquarium(5);
        Cat somecat = new Cat("Some Cat");

        Person SomeDude = new Person("Some Dude", "1234235434", smallAquarium, somecat);


        // Create Person without pets
        Person lonelyMan = new Person("Lonely Man", "324234");


        // Test introductions
        Mert.introduceYourself();
        SomeDude.introduceYourself();
        lonelyMan.introduceYourself();


        // Test introductions after removing fish
        Mert.getAquarium().removeFish(7);
        SomeDude.getAquarium().removeFish(7);

        Mert.introduceYourself();
        SomeDude.introduceYourself();
    }
}
