////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Final;

public class Question1 {

    public static void main(String[] args) {

        int[] numbers = {3, 8, 15};
        int[] numbers2 = {3, 8, 2, 5, 1, 9};
        int[] numbers3 = {};
        int[] numbers4 = {1};

        System.out.print("The resulting array is: ");
        delta(numbers);

        System.out.print("\n--------------------------------------------------\n");

        System.out.print("The resulting array is: ");
        delta(numbers2);

        System.out.print("\n--------------------------------------------------\n");

        System.out.print("The resulting array is: ");
        delta(numbers3);

        System.out.print("\n--------------------------------------------------\n");

        System.out.print("The resulting array is: ");
        delta(numbers4);

        System.out.print("\n--------------------------------------------------\n");
    }

    public static int[] delta(int[] array){
        int resultArraySize = array.length * 2 - 1;
        int originalArrayIndex;

        if(resultArraySize < 0) return new int [0];

        int[] resultArray = new int[resultArraySize];

        for(int i = 0; i < resultArraySize; i++)
        {
            originalArrayIndex = i / 2;

            if( i % 2 == 0){
                resultArray[i] = array[originalArrayIndex];
            }
            else{
                resultArray[i] = array[originalArrayIndex + 1] - array[originalArrayIndex];
            }

            System.out.print(resultArray[i] + " ");
        }

        return resultArray;
    }
}
