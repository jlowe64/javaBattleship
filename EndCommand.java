
/**
 * Write a description of class EndCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class EndCommand extends Command
{
    // instance variables
    
    /**
     * Constructor for objects of class EndCommand
     */
    public EndCommand()
    {
        //
    }

    /**
     * ''END'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() == null)
        {
            return true;
        }
        else 
        {
            System.out.println("In order to quit, just type END.");
            return false;
        }
    }
}
