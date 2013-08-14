
/**
 * Write a description of class ShipCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

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
    public boolean execute(Player p)
    {
        System.out.println("Ship");
        return false;
    }
}
