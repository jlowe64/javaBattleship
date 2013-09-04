import java.util.StringTokenizer;

/**
 * Protocol handles all the handshaking between Hosts and Client
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (September 2013)
 */
public class Protocol
{
    private CommandWords commands;

    /**
     * Constructor for objects of class Protocol
     */
    public Protocol()
    {
        commands = new CommandWords();
    }
    
    /**
     * Get commands for protocol
     */
    public Command getCommand(String input)
    {
        input = "";
        
        String w1;
        String w2;
        String w3;
        
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        if(tokenizer.hasMoreTokens())
        {
            w1 = tokenizer.nextToken(); //Word 1
        }
        else
        {
            w1 = null;
        }
        
        if(tokenizer.hasMoreTokens())
        {
            w2 = tokenizer.nextToken(); //Word 2
        }
        else
        {
            w2 = null;
        }
        
        if(tokenizer.hasMoreTokens())
        {
            w3 = tokenizer.nextToken(); //Word 3
        }
        else
        {
            w3 = null;
        }
        
        Command command = commands.getCommand(w1);
        if(command != null)
        {
            command.setSecondWord(w2);
            command.setThirdWord(w3);
        }
        
        return command;
    }
}
