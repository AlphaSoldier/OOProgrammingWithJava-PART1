
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment)
    {
        if(this.rooms > otherApartment.rooms)
            return true;
        if(this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.squareMeters)
            return true;
        return false;
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int diff = Math.abs(this.price - otherApartment.price);
        return diff;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        if(this.price > otherApartment.price)
            return true;
        return false;
    }
}
