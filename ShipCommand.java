
/**
 * Write a description of class ShipCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class ShipCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "SHIP";

    /**
     * Constructor for objects of class ShipCommand
     */
    public ShipCommand()
    {
        //
    }

    /**
     * ''BATTLESHIP'' | ''DESTROYER'' | ''SUBMARINE''
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Ship");
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
