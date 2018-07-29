
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int first, last, sum = 0;
        
        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Lsst: ");
        last = Integer.parseInt(reader.nextLine());
        
        while(first <= last)
        {
            sum += first;
            first++;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
