import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name,MyDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name)
    {
        int d = Calendar.getInstance().get(Calendar.DATE);
        int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(d,m,y);
        this.name = name;
        this.birthday = today;
        
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int d = Calendar.getInstance().get(Calendar.DATE);
        int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(d,m,y);
        return today.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(this.birthday.earlier(compared.birthday))
            return true;
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
