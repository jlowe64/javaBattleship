
/**
 * Write a description of class IntCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class IntCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "INT";

    /**
     * Constructor for objects of class IntCommand
     */
    public IntCommand()
    {
        //
    }

    /**
     * an integer
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Int");
        return false;
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
