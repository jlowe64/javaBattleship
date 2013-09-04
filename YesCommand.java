
/**
 * Write a description of class YesCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class YesCommand extends Command
{
    // instance variables
    private String name = "YES";
    
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
        if(getSecondWord() == null)
        {
            System.out.println("Yes");
            return true;
        }
        else 
        {
            System.out.println("YES not used correctly.");
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
