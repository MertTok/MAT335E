package LabWork7;

public class Question2 {

    public static void main(String[] args) {
        Book item1 = new Book("Meditations", "Marcus Aurelius", 13.99, 155);
        Book item2 = new Book("The Art of War", "Sun Tzu", 8.99, 273);
        Book item3 = new Book("Protagoras", "Plato", 9.99, 55);
        Book item4 = new Book("12 Rules for Life", "Jordan Peterson", 43.99, 1288);

        item1.sellBook();
        item2.sellBook();
        item3.sellBook();
        item4.sellBook();

        item1.sellBook(8);
        item2.sellBook(21);
        item3.sellBook(76);
        item4.sellBook(736);
    }
}
