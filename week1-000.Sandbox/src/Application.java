// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.*;
import javax.swing.SwingUtilities;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        
        HashMap<Book, String> loaners = new HashMap<Book, String>();

        Book objectbook = new Book("Objectbook", 2000);
        loaners.put( objectbook, "Pekka" );
        loaners.put( new Book("Test Driven Development",1999), "Arto" );

        System.out.println( loaners.get( objectbook ) );
        System.out.println( loaners.get( new Book("Objectbook", 2000) ));
        System.out.println( loaners.get( new Book("Test Driven Development", 1999) ));
        
        System.out.println(new Random().nextInt(61) - 30);
        
        ArrayList<String> words = new ArrayList<String>();
        
        words.add("");
        words.add("");
        words.add("");
        
        System.out.println(words + "\n" + words.size());
        
        int[][] array = new int[5][5];
        
        int x = 0;
        
        for(int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            { 
                x++;
                array[i][j] = x;
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {    
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        
        //new FrameColorChanger();
        double d = 0.5;
        double newD = d * 100;
        System.out.println(newD);
    }
}
