////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-3
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Final;

public class Question3 {

    public static void main(String[] args) {
        String[] a1 = {"hi", "Ed", "how", "are", "you", "folks", "DoIng", "today?"};
        String[] a2 = {"hi", "Bob", "how", "are", "YOUR", "kids", "doing", "today?"};
        String[] a3 = {"hi", "you", "how", "are", "you", "guys", "DOING", "today?"};
        String[] a4 = {"hi", "Ed", "how", "ARE", "you", "Doing", "I'm", "fine"};
        String[] a5 = {"hi", "Bob", "how", "are", "YOU", "Doing"};
        String[] a6 = {"hi", "you", "how", "is", "you", "Doing", "this", "fine", "day?"};

        System.out.println(countCommon(a1, a2, a3));
        System.out.println(countCommon(a4, a5, a6));
    }

    public static int countCommon(String[] a1, String[] a2, String[] a3){
        int lookupLength = Math.min(Math.min(a1.length, a2.length), a3.length);
        int totalCount = 0;

        for(int i = 0; i < lookupLength; i++)
        {
            if( a1[i].equals(a2[i]) && a2[i].equals(a3[i]) ) totalCount++;
        }

        return totalCount;
    }
}
