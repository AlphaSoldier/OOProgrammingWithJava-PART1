
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your username: ");
        String uname = reader.nextLine();
        
        System.out.print("Type your password: ");
        String pass = reader.nextLine();
        
        if((uname.equals("alex") && pass.equals("mightyducks")) || (uname.equals("emily") && pass.equals("cat")))
        {
            System.out.println("You are now logged into the system!");
        }
        else
        {
            System.out.println("Your username or passsord was invalid!");
        }

    }
}
