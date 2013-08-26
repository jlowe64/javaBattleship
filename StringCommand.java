
/**
 * Write a description of class StringCommand here.
 * 
 * @author Jerrett Fowler    
 * @version 1.0 (August 2013)
 */
public class StringCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringCommand
     */
    public StringCommand()
    {
        //
    }

    /**
     * any string which does no contain ''\n''
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("String");
        return false;
    }
}
