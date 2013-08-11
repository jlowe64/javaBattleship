
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

    /**
     * Constructor for objects of class Ship
     */
    public Ship(int size)
    {
        this.size = hitPoints;
        this.size = size;
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
    
    public int numberOfHitpoints()
    {
        return hitPoints;
    }
    
    //Method to remove hitpoints from a ship
    public void hit()
    {
        hitPoints -= 1;
    }
}
