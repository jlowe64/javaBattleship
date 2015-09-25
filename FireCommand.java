
/**
 * Write a description of class FireCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class FireCommand extends Command
{
    private int column, row;
    private String name = "FIRE";
    
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
            Player p = null;
            p = (Player)o;
            
            String[] strArray = getSecondWord().split(" ");
            int[] intArray = new int[strArray.length];
            
            for(int i = 1; i < strArray.length; i++)
            {
                if(strArray[i] != null)
                {
                    intArray[i] = Integer.parseInt(strArray[i]);
                }
                
            }
            
            System.out.println("Fired on coordinates: " + intArray[1] + " x " + intArray[2]);
            
            return true;
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
