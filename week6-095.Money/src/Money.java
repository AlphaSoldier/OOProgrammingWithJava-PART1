
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added)
    {
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        Money temp = new Money(newEuros, newCents);
        return temp;
    }
    
    public boolean less(Money compared)
    {
        if(this.euros < compared.euros)
            return true;
        else if(this.euros == compared.euros && this.cents < compared.cents)
            return true;
        return false;
    }
    
    public Money minus(Money subtracted)
    {
        int newEuros = this.euros - subtracted.euros;
        int newCents = this.cents - subtracted.cents;
        if(newCents < 0)
        {
            newEuros -= 1;
            newCents += 100;
        }
        if(newEuros < 0)
        {
            newEuros = 0;
            newCents = 0;
        }
        Money temp = new Money(newEuros, newCents);
        return temp;
    }
}
