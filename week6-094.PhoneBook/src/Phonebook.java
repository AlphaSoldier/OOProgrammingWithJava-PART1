import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Person> persons;
    
    public Phonebook()
    {
        persons = new ArrayList<Person>();
    }
    
    public void add(String name, String number)
    {
        persons.add(new Person(name, number));
    }
    
    public void printAll()
    {
        for(Person p : persons)
        {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name)
    {
        String result = "number not known";
        for(Person p : persons)
        {
            if(p.getName().equals(name))
                    result = p.getNumber();
        }
        return result;
    }
}
