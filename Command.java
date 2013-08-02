
/**
 * Write a description of class Command here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (July 2013)
 */
public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * Constructor for objects of class Command
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
    
    /**
     * Execute a command
     */
    public void execute(Command c)
    {
        //executes a command
    }

    /**
     * Return command word
     */
    public String getCommandWord()
    {
        return commandWord;
    }
    
    /**
     * Return second word
     */
    public String getSecondWord()
    {
        return secondWord;
    }
    
    /**
     * Return true if command is unknown
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }
    
    /**
     * Return true if the command has a second word
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
