import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList();
        String temp = "";
        while(true)
        {
            System.out.print("Type a word: ");
            temp = reader.nextLine();
            if(temp.equals(""))
                break;
            words.add(temp);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for(String word : words)
        {
            System.out.println(word);
        }
    }
}
