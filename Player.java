
/**
 * This is the Player class used for creating Players
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class Player
{
    // instance variables
    private String playerName;
    private boolean currentTurn = false;
    private boolean winnerOrLoser = false;

    /**
     * Constructor for objects of class Player
     */
    public Player(String s)
    {
        s = playerName;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    {
        return playerName;
    }
    
    /*
     * Get Turn
     */
    public boolean getTurn(Player p)
    {
        return currentTurn;
    }
    
    /*
     * Set Turn
     */
    public void setTurn(boolean b)
    {
        currentTurn = b;
    }
    
    /*
     * Get Winner
     */
    public boolean getIWin(Player p)
    {
        return winnerOrLoser;
    }
    
    /*
     * Set Winner
     */
    public void setIWin(boolean b)
    {
        winnerOrLoser = b;
    }
}
