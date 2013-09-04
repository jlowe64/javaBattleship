
/**
 * Write a description of class NoCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class NoCommand extends Command
{
    // instance variables
    private String name = "NO";

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
        if(getSecondWord() == null)
        {
            System.out.println("No");
            return true;
        }
        else 
        {
            System.out.println("NO not used correctly.");
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
