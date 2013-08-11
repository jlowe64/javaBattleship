
/**
 * Write a description of class Fleet here.
 * 
 * @author Jerrett Fowler   
 * @version 1.0 (August 2013)
 */
public class Fleet
{
    // instance variables
    private Ship sub1;
    private Ship sub2;
    private Ship sub3;
    private Ship battleship1;
    private Ship destroyer1;
    private Ship destroyer2;
    private int sizeOfFleet;
    
    /**
     * Constructor for objects of class Fleet
     */
    public Fleet()
    {
        //3 Subs
        sub1 = new Ship(2);
        sub2 = new Ship(2);
        sub3 = new Ship(2);
        
        //1 Battleship
        battleship1 = new Ship(4);
        
        //2 Destroyers
        destroyer1 = new Ship(3);
        destroyer1 = new Ship(3);
        
        //Size of fleet
        sizeOfFleet = 6;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int size()
    {
        return sizeOfFleet;
    }
    
    //Method to remove ships from fleet
    public void sink(Ship s)
    {
        if(s.numberOfHitpoints() == 0)
        {
            sizeOfFleet -= 1;
        }
    }
}
