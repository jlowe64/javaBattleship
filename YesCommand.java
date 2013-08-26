
/**
 * Write a description of class YesCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class YesCommand extends Command
{
    // instance variables

    /**
     * Constructor for objects of class YesCommand
     */
    public YesCommand()
    {
        //
    }

    /**
     * ''YES'' \n
     * 
     * @param  n   derp
     * @return     boolean
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Yes");
        return false;
    }
}
