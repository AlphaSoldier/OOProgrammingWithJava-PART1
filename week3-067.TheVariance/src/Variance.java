import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i : list)
        {
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) / (double) list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double sum = 0;
        double avg = average(list);
        if(list.size() > 1)
        {
            for(int i : list)
            {
                sum += (double) Math.pow(i - avg, 2);
            }
            return (double) sum / (list.size() - 1);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
