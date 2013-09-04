
/**
 * Write a description of class FireCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class FireCommand extends Command
{
    int column, row;

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
    public boolean execute(Object o)
    {
        if(getSecondWord() == null)
        {
            System.out.println("You need to input column then row. Also, start counting from 0, not 1.");
            return false;
        }
        else
        {
            //Check for the secondword and thirdword being ints and convert to ints appropriately
            System.out.println("Fire");
            return true;
        }
    }
}
