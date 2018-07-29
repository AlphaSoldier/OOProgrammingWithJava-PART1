import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        ArrayList<Integer> scores = new ArrayList();
        System.out.println("Type exam scores, -1 completes:");
        while(true)
        {
            int points = Integer.parseInt(reader.nextLine());
            if(points == -1)
                break;
            scores.add(points);
        }
        Grader grader = new Grader(scores);
        System.out.println("Grade distribution:");
        grader.printGraph();
        System.out.println("Acceptance percentage: " + grader.getAcceptance());
    }
}
