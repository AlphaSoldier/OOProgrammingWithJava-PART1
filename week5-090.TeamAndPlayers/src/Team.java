import java.util.ArrayList;

public class Team
{
    private String name;
    private int teamSize;
    private ArrayList<Player> players;
    
    public Team(String name)
    {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.teamSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void setMaxSize(int size)
    {
        if(size > 0 && size <= 16)
            teamSize = size;
    }
    
    public int size()
    {
        return players.size();
    }
    
    public void addPlayer(Player player)
    {
        if(players.size() < teamSize)
            players.add(player);
    }
    
    public int goals()
    {
        int goals = 0;
        for(Player p : players)
        {
            goals += p.goals();
        }
        return goals;
    }
    
    public void printPlayers()
    {
        for(Player p : players)
        {
            System.out.println(p);
        }
    }
}