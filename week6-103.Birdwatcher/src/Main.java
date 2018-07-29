import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
        Scanner reader = new Scanner(System.in);
        
        Birdwatcher x = new Birdwatcher();
        String name = "";
        String latinName = "";
        String input = "";
        
        while(true)
        {
            System.out.print("? ");
            input = reader.nextLine();
            if(input.equals("Add"))
            {
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.print("Latin Name: ");
                latinName = reader.nextLine();
                x.addBird(name, latinName);
            }
            else if(input.equals("Observation"))
            {
                System.out.print("What was observed:? " );
                name = reader.nextLine();
                x.observation(name);
            }
            else if(input.equals("Statistics"))
            {
                x.statistics();
            }
            else if(input.equals("Show"))
            {
                System.out.print("What? ");
                name = reader.nextLine();
                x.show(name);
            }
            else if(input.equals("Quit"))
                break;
        }
            
    }

}
