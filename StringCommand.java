
/**
 * Write a description of class StringCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringCommand
     */
    public StringCommand()
    {
        //
    }

    /**
     * any string which does no contain ''\n''
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Player p)
    {
        System.out.println("String");
        return false;
    }
}
