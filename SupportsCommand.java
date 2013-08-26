
/**
 * Write a description of class SupportsCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class SupportsCommand extends Command
{
    // instance variables

    /**
     * Constructor for objects of class SupportsCommand
     */
    public SupportsCommand()
    {
        //
    }

    /**
     * ''SUPPORTS_'' <STRING> \n
     * 
     * @param  p   a sample parameter for a method
     * @return     boolean
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Supports");
        return false;
    }
}
