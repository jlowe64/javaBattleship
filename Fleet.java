import java.util.ArrayList;

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
    private ArrayList<Ship> fleet;
    
    /**
     * Constructor for objects of class Fleet
     */
    public Fleet()
    {
        //3 Subs
        sub1 = new Ship("s1", 2, 0, 0, 0);
        sub2 = new Ship("s2", 2, 0, 0, 0);
        sub3 = new Ship("s3", 2, 0, 0, 0);
        
        //1 Battleship
        battleship1 = new Ship("b1", 4, 0, 0, 0);
        
        //2 Destroyers
        destroyer1 = new Ship("d1", 3, 0, 0, 0);
        destroyer2 = new Ship("d2", 3, 0, 0, 0);
        
        fleet = new ArrayList();
        
        fleet.add(sub1);
        fleet.add(sub2);
        fleet.add(sub3);
        fleet.add(battleship1);
        fleet.add(destroyer1);
        fleet.add(destroyer2);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int size()
    {
        return fleet.size();
    }
    
    /**
     * Remove ships from fleet
     * 
     * @param  s   A ship
     * @return     void
     */
    public void sink(Ship s)
    {
        if(s.numberOfHitpoints() == 0)
        {
            fleet.remove(s);
        }
    }
    
    
    /**
     * Return an instance of a specific ship
     * 
     * @param  s   A ship
     * @return     ship
     */
    public Ship getShipInFleet(String shipID)
    {
        Ship ship = new Ship("id", 0, 0, 0, 0);
        for(Ship s : fleet)
        {
            if(s.getShipID().equals(shipID))
            {
                ship = s;
            }
        }
        return ship;
    }
    
    /**
     * Return all ships locations/Prints
     * 
     * @param  position   where is the ship?
     * @return     Return ship 
    
    public Ship location(int position)
    {
        //
        return ;
    }*/
}
