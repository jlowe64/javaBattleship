
/**
 * Write a description of class ShipCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (September 2013)
 */
public class PlaceCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "PLACE";

    /**
     * Constructor for objects of class ShipCommand
     */
    public PlaceCommand()
    {
        //
    }

    /**
     * ''SHIP_''<INT> _ <INT>
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        Ship s = null;
        s = (Ship)o;
        
        System.out.println("Place");
        return false;
    }
    
    /**
     * Return String of name of command
     */
    @Override
    public String getName()
    {
        return name;
    }
}
