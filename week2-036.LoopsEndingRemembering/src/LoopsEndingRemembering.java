import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int x = 0, sum = 0, count = 0, ec = 0, oc = 0;
        double avg = 0.0;
        
        System.out.println("Type numbers:");
        
        while(x != -1)
        {
            x = Integer.parseInt(reader.nextLine());
            if(x == -1)
                break;
            sum += x;
            count++;
            if(x % 2 == 0)
                ec++;
            else
                oc++;
        }
        
        avg = (double) sum / count;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + ec);
        System.out.println("Odd numbers: " + oc);

    }
}
