import java.util.ArrayList;

public class Birdwatcher
{
    private ArrayList<Bird> birds;
    
    public Birdwatcher()
    {
        birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName)
    {
        birds.add(new Bird(name, latinName));
    }
    
    public void observation(String name)
    {
        boolean observed = false;
        for(Bird b : birds)
        {
            if(b.getName().contains(name))
            {
                observed = true;
                b.observed();
            }
        }
        if(!observed)
            System.out.println("Is not a bird!");
    }
    
    public void statistics()
    {
        for(Bird b : birds)
        {
            System.out.println(b);
        }
    }
    
    public void show(String name)
    {
        for(Bird b : birds)
        {
            if(b.getName().contains(name))
                System.out.println(b);
        }
    }
}