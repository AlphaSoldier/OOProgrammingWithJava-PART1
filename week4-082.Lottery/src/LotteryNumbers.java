import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while(this.numbers.size() < 7)
        {
            int x = random.nextInt(39) + 1;
            if(!this.containsNumber(x))
               this.numbers.add(x);
        }
    }

    public boolean containsNumber(int number) {
        for(int i : numbers)
        {
            if(i == number)
                return true;
        }
        return false;
    }
}
