
/**
 * Write a description of class ReadyCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class ReadyCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "READY";

    /**
     * Constructor for objects of class ReadyCommand
     */
    public ReadyCommand()
    {
        //
    }

    /**
     * ''READY'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        Player p = null;
        p = (Player)o;
        
        if(getSecondWord() == null)
        {
            System.out.println("Ready");
            p.setReady(true);
            return true;
        }
        else 
        {
            System.out.println("READY not used correctly.");
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
