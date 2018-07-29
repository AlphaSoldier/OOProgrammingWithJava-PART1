
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        
        int input = Integer.parseInt(reader.nextLine());
        
        int x = 1;
        while(x <= input)
        {
            System.out.println(x);
            x++;
        }
        
    }
}
