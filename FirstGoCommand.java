
/**
 * Write a description of class FirstGoCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class FirstGoCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FirstGoCommand
     */
    public FirstGoCommand()
    {
        //
    }

    /**
     * ''FIRSTGO_'' ''YOU'' | ''ME'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("FirstGo");
        return false;
    }
}
