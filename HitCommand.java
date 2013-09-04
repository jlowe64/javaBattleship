
/**
 * Write a description of class HitCommand here.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (August 2013)
 */
public class HitCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HitCommand
     */
    public HitCommand()
    {
        //
    }

    /**
     * ''HIT_'' <SHIP> \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() != null)
        {
            System.out.println("Hit");
            return true;
        }
        else 
        {
            System.out.println("You must enter a Ship.");
            return false;
        }
    }
}
