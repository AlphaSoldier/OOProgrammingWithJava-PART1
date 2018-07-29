import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int x, i = 1, fact = 1;
        
        System.out.print("Type a number: ");
        x = Integer.parseInt(reader.nextLine());
        
        if(x == 0)
        {
            System.out.println("Factorial is " + fact);
        }
        
        while(i <= x)
        {
            fact *= i;
            i++;
        }
        
        System.out.println("Factorial is " + fact);

    }
}
