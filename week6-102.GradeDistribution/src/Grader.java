import java.util.ArrayList;
import java.util.Arrays;

public class Grader
{
    private ArrayList<Integer> scores;
    private double acceptance;
    
    public Grader(ArrayList<Integer> scores)
    {
        this.scores = new ArrayList<Integer>();
        this.scores = scores;
        acceptance = 0.0;
    }
    public int[] convertToGrades()
    {
        int[] grades = {0, 0, 0, 0, 0, 0};
        for(int s : scores)
        {
            if(s >= 0 && s <= 29)
                grades[0]++;
            else if(s >= 30 && s <= 34)
                grades[1]++;
            else if(s >= 35 && s <= 39)
                grades[2]++;
            else if(s >= 40 && s <= 44)
                grades[3]++;
            else if(s >= 45 && s <= 49)
                grades[4]++;
            else if(s >= 50 && s <= 60)
                grades[5]++;  
        }
        return grades;
    }

    public double getAcceptance() {
        int[] grades = convertToGrades();
        int accepted = 0;
        int total = grades[0];
        for (int i = 1; i < grades.length; i++)
        {
            accepted += grades[i];
            total += grades[i];
        }
        if(!(total == 0))
            acceptance = (100 * accepted) / total;
        return acceptance;
    }
    
    public void printGraph()
    {
        int[] grades = convertToGrades();
        for(int i = 5; i >= 0; i--)
        {
            System.out.print(i + ": ");
            for(int j = 0; j < grades[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}