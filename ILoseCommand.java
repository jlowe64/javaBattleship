
/**
 * Write a description of class ILoseCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class ILoseCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "ILOSE";

    /**
     * Constructor for objects of class ILoseCommand
     */
    public ILoseCommand()
    {
        //
    }

    /**
     * ''ILOSE'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() == null)
        {
            System.out.println("I Lose");
            return true;
        }
        else 
        {
            System.out.println("ILOSE not used correctly.");
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
