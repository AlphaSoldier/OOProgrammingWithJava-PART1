
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();
        String name = "", studentNumber = "";
        
        while(true)
        {
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.equals(""))
                break;
            System.out.print("studentNumber: ");
            studentNumber = reader.nextLine();
            students.add(new Student(name,studentNumber));
        }
        
        for(Student s : students)
        {
            System.out.println(s);
        }
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for(Student s : students)
        {
            if(s.getName().contains(search))
                System.out.println(s);
        }
    }
}