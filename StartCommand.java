
/**
 * StartCommand starts a game. Specification below.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class StartCommand extends Command
{
    // instance variables
    

    /**
     * Constructor for objects of class StartCommand
     */
    public StartCommand()
    {
        //
    }

    /**
     * ''START'' \n
     * 
     * @param  p   a sample parameter for a method
     * @return     boolean
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Start");
        return false;
    }
}
