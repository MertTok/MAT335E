package LabWork9;
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        int [] array = new int[] {1,2,4,5,3,6,4,7,8,9,9,9,9};

        System.out.println(findDifNumbersinArray(array));
    }

    public static int findDifNumbersinArray(int [] array){
        int differentNumbers = 0;

        Arrays.sort(array);

        // Create a holder array with the size of array's largest element (which is the last value)
        boolean [] seenNumbers = new boolean [array[array.length-1] + 1];

        // Set all values to false
        Arrays.fill(seenNumbers, false);

        for(int i = 0; i < array.length; i++)
        {
            // Check if the number was seen before (true -> seen , false -> not seen
            if(seenNumbers[array[i]])
            {
                continue;
            }
            seenNumbers[array[i]] = true;
            differentNumbers++;
        }

        return differentNumbers;
    }
}


