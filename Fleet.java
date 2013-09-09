import java.util.ArrayList;
import java.util.Iterator;

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
        sub1 = new Ship("SUBMARINE1", 2, 1, 0, 0);
        sub2 = new Ship("SUBMARINE2", 2, 0, 2, 2);
        sub3 = new Ship("SUBMARINE3", 2, 1, 1, 6);
        
        //1 Battleship
        battleship1 = new Ship("BATTLESHIP1", 4, 0, 5, 2);
        
        //2 Destroyers
        destroyer1 = new Ship("DESTROYER1", 3, 1, 7, 1);
        destroyer2 = new Ship("DESTROYER2", 3, 1, 6,7);
        
        fleet = new ArrayList<Ship>();
        
        fleet.add(sub1);
        fleet.add(sub2);
        fleet.add(sub3);
        fleet.add(battleship1);
        fleet.add(destroyer1);
        fleet.add(destroyer2);
        
    }

    /**
     * Size of fleet
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
     * @param  shipID   A ship
     * @return     ship
     */
    public Ship getShipInFleet(String shipID)
    {
        Ship temp = null;
        for(Ship s : fleet)
        {
            if(s.getShipID().equals(shipID))
            {
                temp = s;
            }
        }
        return temp;
    }
    
    /**
     * Lists all ships
     */
    public void getFleet()
    {
        Iterator<Ship> itr = fleet.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
