import java.io.*;

/**
 * Write a description of class TalkCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class TalkCommand extends Command
{
    // instance variables - replace the example below with your own
    private String name = "TALK";
    
    
    /**
     * Constructor for objects of class TalkCommand
     */
    public TalkCommand()
    {
        //
    }

    /**
     * ''TALK_'' <STRING> \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() == null)
        {
            Player p = null;
            p = (Player)o;
            String input = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            try
            {
                input = reader.readLine();
            }
            catch(java.io.IOException exc)
            {
                System.out.println("Error reading: " + exc.getMessage());
            }
            
            
            System.out.println(input);
            
            //handle using the string command
            return true;
        }
        else 
        {
            System.out.println("Talk not used correctly. You must send a message after the command.");
            return false;
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
