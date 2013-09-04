import java.util.ArrayList;

/**
 * Write a description of class SupportsCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class SupportsCommand extends Command
{
    // instance variables
    ArrayList<String> supports = new ArrayList();
    
    /**
     * Constructor for objects of class SupportsCommand
     */
    public SupportsCommand()
    {
        supports.add("DEFAULT");
    }

    /**
     * ''SUPPORTS_'' <STRING> \n
     * 
     * @param  p   a sample parameter for a method
     * @return     boolean
     */
    @Override
    public boolean execute(Object o)
    {
        System.out.println("Supports");
        return false;
    }
    
    /*
     * Yes/No feature set
     */
    public boolean getSupports(String feature)
    {
        boolean b = false;
       
        for(String s : supports)
        {
            if(s.equals(feature))
            {
                b = true;
            }
            else
            {
                b = false;
            }
        }
        return b;
    }
}
