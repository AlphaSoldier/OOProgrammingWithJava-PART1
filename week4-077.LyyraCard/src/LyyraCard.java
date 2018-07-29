public class LyyraCard
{
    private double balance;
    
    public LyyraCard(double startingBalance)
    {
        this.balance = startingBalance;
    }
    
    public void payEconomical()
    {
        if(this.balance >= 2.50)
        {
            this.balance -= 2.50;
        }
    }
    
    public void payGourmet()
    {
        if(this.balance >= 4.00)
        {
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount)
    {
        if(!(amount < 0))
            this.balance += amount;
        if(this.balance > 150.0)
        {
            this.balance = 150.0;
        }
    }
    
    public String toString()
    {
        return "The card has " + balance + " euros"; 
    }
}
