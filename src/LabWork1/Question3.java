package LabWork1;

public class Question3 {

    public static void main(String[] args){
        int a = 3, b = 7;

        // Here ints a and b are added first, since the program flows from top to bottom and in this case
        // left to right. Therefore the operation a + b comes first and yields another integer, 10.
        System.out.println(a + b + "String");

        // Here before the addition could be made an empty string is concatenated with an integer a
        // In this case int a is first converted to a string value which are then concatenated.
        // Now the result of "" + a is "3", which makes the next operation another String + int operation.
        // "3" + 7 = "37" then "String" is concatenated to the resulting string which yields "37String"
        System.out.println("" + a + b + "String");

        // This example is different from the one above since there is a parenthesis which takes the priority.
        // Therefore the first operation will be a summation, a + b = 3 + 7 = 10
        // Now the flow from left to right will go as expected.
        // "" + 10 = "10"
        // "10" + "String" = "10String" which is the result.
        System.out.println("" + (a+b) + "String");
    }
}
