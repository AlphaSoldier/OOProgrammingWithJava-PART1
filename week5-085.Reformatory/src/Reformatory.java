public class Reformatory {
    
    private int weightMeasureCount;
    
    public Reformatory()
    {
        weightMeasureCount = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        weightMeasureCount++;
        return person.getWeight();
    }
    
    public void feed(Person person)
    {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured()
    {
        return weightMeasureCount;
    }
}
