
/**
 * Write a description of class SunkCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class SunkCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "SUNK";

    /**
     * Constructor for objects of class SunkCommand
     */
    public SunkCommand()
    {
        //
    }

    /**
     * ''SUNK_'' <SHIP> \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() != null)
        {
            Ship s = null;
            s = (Ship)o;
            
            //if ship's
            
            System.out.println("You sunk my ship.");
            return true;
        }
        else 
        {
            System.out.println("You must enter a ship.");
            return false;
        }
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
