
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        
        double result = 2 * Math.PI * radius;
        
        System.out.println("Circumference of the circle: " + result);
        
    }
}
