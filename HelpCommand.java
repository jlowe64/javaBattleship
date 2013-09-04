
/**
 * Write a description of class HelpCommand here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (September 2013)
 */
public class HelpCommand extends Command
{
    // instance variables
    private String name = "HELP";
    
    /**
     * Constructor for objects of class HelpCommand
     */
    public HelpCommand()
    {
        //
    }

    /**
     * ''HELP'' \n
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean execute(Object o)
    {
        if(getSecondWord() == null)
        {
            CommandWords commands = null;
            commands = (CommandWords)o;
            commands.printCommands();
            return true;
        }
        else 
        {
            System.out.println("HELP not used correctly.");
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
