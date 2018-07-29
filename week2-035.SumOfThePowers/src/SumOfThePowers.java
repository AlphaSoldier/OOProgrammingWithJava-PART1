
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int power, x = 0, sum = 0;
        
        System.out.print("Type a number: ");
        power = Integer.parseInt(reader.nextLine());
        
        while(x <= power)
        {
            sum += (int) Math.pow(2, x);
            x++;
        }
        
        System.out.println("The result is " + sum);

    }
}
