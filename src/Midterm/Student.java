////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Midterm;

public class Student {
    private String name;
    private String surname;
    private int idnumber;
    private int year;

    public Student(String name, String surname, int idnumber, int year){
        this.name = name;
        this.surname = surname;
        this.idnumber = idnumber;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getIdnumber(){
        return this.idnumber;
    }

    public void setIdnumber(int idnumber){
        this.idnumber = idnumber;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getFullName(){
        return getName() + " " + getSurname();
    }
}
