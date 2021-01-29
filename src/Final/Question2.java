////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-2
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Final;

public class Question2 {

    public static void main(String[] args) {

        Date jan01 = new Date( 1, 1);
        Date jul04 = new Date( 7, 4);
        Date jul22 = new Date( 7, 22);
        Date sep19 = new Date( 9, 19);
        Date dec03 = new Date(12, 3);

        System.out.println(jul04.isBefore(jul22));
        System.out.println(sep19.isBefore(dec03));
        System.out.println(jan01.isBefore(sep19));

        System.out.println(dec03.isBefore(jul22));
        System.out.println(jul22.isBefore(jul04));
        System.out.println(sep19.isBefore(sep19));
    }
}
