public class Counter
{
    private int counter;
    private boolean checkUnderZero;
    
    public Counter(int startingValue, boolean check)
    {
        counter = startingValue;
        checkUnderZero = check;
    }
    
    public Counter(int startingValue)
    {
        this(startingValue,false);
    }
    
    public Counter(boolean check)
    {
        this(0,check);
    }
    
    public Counter()
    {
        this(0,false);
    }
    
    public int value()
    {
        return counter;
    }
    
    public void increase(int increaseAmount)
    {
        if(increaseAmount >= 0)
        {
            counter += increaseAmount;
        }
    }
    
    public void increase()
    {
        this.increase(1);
    }
    
    public void decrease(int decreaseAmount)
    {
        if(decreaseAmount >= 0)
        {
            if(!checkUnderZero)
                counter -= decreaseAmount;
            if(checkUnderZero && counter > 0)
            {
                counter -= decreaseAmount;
                if(counter < 0)
                    counter = 0;
            }
        }
    }
    
    public void decrease()
    {
        this.decrease(1);
    }
}
