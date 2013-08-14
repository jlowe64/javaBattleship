
/**
 * Write a description of class EndCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndCommand extends Command
{
    // instance variables
    
    /**
     * Constructor for objects of class EndCommand
     */
    public EndCommand()
    {
        //
    }

    /**
     * ''END'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Player p)
    {
        if(getSecondWord() == null)
        {
            return true;
        }
        else 
        {
            System.out.println("Quit what?");
            return false;
        }
    }
}
