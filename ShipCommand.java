
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
     * ''BATTLESHIP'' | ''DESTROYER1'' | ''SUBMARINE1''
     * | ''SUBMARINE2'' | ''SUBMARINE3'' | ''DESTROYER2''
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        Ship s = null;
        s = (Ship)o;
        
        if(getSecondWord() == null)
        {
            if(s.getShipID().equals("SUBMARINE1"))
            {
                System.out.println("SUBMARINE1");
            }
            else if(s.getShipID().equals("SUBMARINE2"))
            {
                System.out.println("SUBMARINE2");
            }
            else if(s.getShipID().equals("SUBMARINE3"))
            {
                System.out.println("SUBMARINE3");
            }
            else if(s.getShipID().equals("BATTLESHIP1"))
            {
                System.out.println("BATTLESHIP1.");
            }
            else if(s.getShipID().equals("DESTROYER1"))
            {
                System.out.println("DESTROYER1");
            }
            else if(s.getShipID().equals("DESTROYER2"))
            {
                System.out.println("DESTROYER2");
            }
            else
            {
                System.out.println("No such ship name.");
                return false;
            }
        }
        else
        {
            
        }
        return true;
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
