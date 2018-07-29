
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance()
    {
        if(day == 30)
        {
            day = 1;
            if(month == 12)
            {
                month = 1;
                year += 1;
            }
            else
                month += 1;
        }
        else
            day = day + 1;
    }
    
    public void advance(int numberOfDays)
    {
       int i = 0;
       while(i < numberOfDays)
       {
           this.advance();
           ++i;
       }
    }
    
    public MyDate afterNumberOfDays(int days)
    {
        MyDate newDate = new MyDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}