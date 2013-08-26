
/**
 * Write a description of class NoCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class NoCommand extends Command
{
    // instance variables

    /**
     * Constructor for objects of class NoCommand
     */
    public NoCommand()
    {
        //
    }

    /**
     * ''NO'' \n
     * 
     * @param  p   a sample parameter for a method
     * @return     boolean 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("No");
        return false;
    }
}
