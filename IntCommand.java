
/**
 * Write a description of class IntCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

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
    public boolean execute(Player p)
    {
        System.out.println("Int");
        return false;
    }
}
