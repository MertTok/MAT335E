package LabWork3;

public class Question3 {

    public static void main(String[] args)
    {
        // 1 - Create an object
        Employee Mert = new Employee("Mert", 14, 15,false);

        // 2 - Check if the employee deserves a bonus
        if(Mert.deserveBonus()) System.out.print("\nThis person deserves a bonus.");
        else System.out.print("\nThis person does not deserve a bonus");

        // 3 - Calculate employee's salary
        System.out.print( "\n" + Mert.getEssn() + "'s salary is " + Mert.calculateSalary(8, 30));

        // 4 - Set employee's working year field
        Mert.setWorkingYear(21);

        // 5 - Check if employee is retired
        if(Mert.getIsRetired()) System.out.print("\n" + Mert.getEssn() + " is retired");
        else System.out.print("\n" + Mert.getEssn() + " is not retired");
    }
}
