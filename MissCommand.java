
/**
 * Write a description of class MissCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class MissCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MissCommand
     */
    public MissCommand()
    {
        //
    }

    /**
     * ''MISS'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Miss");
        return false;
    }
}
