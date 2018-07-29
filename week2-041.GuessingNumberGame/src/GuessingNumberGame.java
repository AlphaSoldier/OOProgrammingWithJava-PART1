
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int tries = 1;
        
        while(guess != numberDrawn)
        {
            if(guess < numberDrawn)
            {
                System.out.println("The number is greater, guesses made: " + tries);
            }
            else
            {
                System.out.println("The number is lesser, guesses made: " + tries);
            }
            guess = Integer.parseInt(reader.nextLine());
            tries++;
        }
        
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
