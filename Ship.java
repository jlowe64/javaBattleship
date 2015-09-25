
/**
 * Write a description of class Ship here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class Ship
{
    // instance variables
    private int hitPoints;
    private int size;
    private int orientation;
    private int row;
    private int column;
    private String shipID;

    /**
     * Constructor for objects of class Ship
     */
    public Ship(String id, int size, int direction, int row, int column)
    {
        this.hitPoints = size;
        this.size = size;
        this.orientation = direction;
        
        //check if valid row
        this.row = row;
        
        //check if valid column
        this.column = column;
        
        this.shipID = id;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * Insert a ship at a certain coordinate
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void placeShip(Ship s)
    {
        //
    }
    
    /**
     * Returns number of hit points
     */
    public int numberOfHitpoints()
    {
        return hitPoints;
    }
    
    /**
     * Remove hitpoints from ship
     */
    public void hit()
    {
        if(isDestroyed() == true)
        {
            System.out.println("Ship is destroyed, you cannot hit again.");
            //Remove from fleet
        }
        else
        {
            hitPoints -= 1;
        }
    }
    
    /**
     * Constructor for objects of class Ship
     */
    public boolean isDestroyed()
    {
        return hitPoints == 0;
    }
    
    /**
     * Orientation
     */
    public int getOrientation()
    {
        return orientation;
    }
    
    /**
     * Row
     */
    public int getRow()
    {
        return row;
    }
    
    /**
     * Column
     */
    public int getColumn()
    {
        return column;
    }
    
    /**
     * Get ID
     */
    public String getShipID()
    {
        return shipID;
    }
    
    /**
     * Set ID
     */
    public void setShipID(String s)
    {
        this.shipID = s;
    }
}
