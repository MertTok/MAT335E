package LabWork3;

public class Employee {
    private String essn;
    private double pricebyHour;
    private int workingYear;
    private boolean isRetired;

    public Employee(String essn, int workingYear, double pricebyHour, boolean isRetired)
    {
        this.essn = essn;
        this.workingYear = workingYear;
        this.pricebyHour = pricebyHour;
        this.isRetired = isRetired;
    }

    // Getters and Setters
    public int getWorkingYear(){
        return workingYear;
    }

    public void setWorkingYear(int workingYear){
        this.workingYear = workingYear;
        if(workingYear > 20) this.retiring();
    }

    public boolean getIsRetired(){
        return isRetired;
    }

    public void setIsRetired(boolean isRetired){
        this.isRetired = isRetired;
    }

    public String getEssn(){
        return essn;
    }

    public double getPricebyHour(){
        return this.pricebyHour;
    }
    // Ends here

    // Helper Methods
    public boolean deserveBonus(){
        return getWorkingYear() > 10 && !getIsRetired();
    }

    public double calculateSalary(int workingHour, int workingDays){
        return workingDays * workingHour * getPricebyHour();
    }

    public void retiring(){
        setIsRetired(true);
    }
    // Ends here
}
