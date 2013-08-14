
/**
 * Write a description of class FireCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FireCommand
     */
    public FireCommand()
    {
        //
    }

    /**
     * ''FIRE_'' <INT> _ <INT> \n (note: give column then row and start counting at 0)
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Player p)
    {
        System.out.println("Fire");
        return false;
    }
}
