
/**
 * Write a description of class FirstGoCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstGoCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FirstGoCommand
     */
    public FirstGoCommand()
    {
        //
    }

    /**
     * ''FIRSTGO_'' ''YOU'' | ''ME'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Player p)
    {
        System.out.println("FirstGo");
        return false;
    }
}
