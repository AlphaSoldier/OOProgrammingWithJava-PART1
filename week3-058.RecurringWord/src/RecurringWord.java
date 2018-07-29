
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList();
        String temp = "";
        while(true)
        {
            System.out.print("Type a word: ");
            temp = reader.nextLine();
            if(words.contains(temp))
            {
                System.out.println("You gave twice the word " + temp);
                break;
            }
            else
                words.add(temp);
        }
    }
}
