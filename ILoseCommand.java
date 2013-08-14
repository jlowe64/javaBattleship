
/**
 * Write a description of class ILoseCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ILoseCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

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
    public boolean execute(Player p)
    {
        System.out.println("I Lose");
        return false;
    }
}
