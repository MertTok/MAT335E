////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-2
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Final;

public class Date {
    private int month;
    private int day;

    public Date(int m, int d){
        month = m;
        day = d;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int d){
        this.day = d;
    }

    public void setMonth(int m){
        this.month = m;
    }

    public int daysInMonth(){
        if(month == 2){
            return 28;
        }
        else if (month % 2 != 0){
            return 31;
        }
        else{
            return 30;
        }
    }

    public boolean equals(Date d){
        return this.getMonth() == d.getMonth() && this.getDay() == d.getDay();
    }

    public void nextDay(){
        int currentDay = getDay();
        int currentMonth = getMonth();

        // If this is the last day of the month
        if(currentDay == daysInMonth())
        {
            setDay(1);

            // If this is the last month of the year
            if(currentMonth == 12)
            {
                setMonth(1);

            }
            // If it is a month other than December
            else
            {
                setMonth(currentMonth + 1);
            }
        }
        // If it is not the last day of the month
        else
        {
            setDay(currentDay + 1);
        }
    }

    public boolean isBefore(Date d){
        if( this.getMonth() > d.getMonth() ) return false;
        else if( this.getMonth() < d.getMonth() ) return true;
        else if( this.getDay() < d.getDay() ) return true;
        return false;
    }

}
