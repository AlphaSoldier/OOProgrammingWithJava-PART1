public class BoundedCounter
{
    private int counter = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperBound)
    {
        upperLimit = upperBound;
    }
    
    public void next()
    {
        counter += 1;
        if(counter > upperLimit)
            counter = 0;
    }
    
    public void setValue(int val)
    {
        if(!(val < 0 || val > upperLimit))
            counter = val;
    }
    
    public int getValue()
    {
        return counter;
    }
    
    public String toString()
    {
        if(counter < 10) // prints '1' as '01' ... '9' as '09'
            return "0" + counter;
        else
            return "" + counter;
    }
}