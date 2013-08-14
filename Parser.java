import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 * Write a description of class Parser here.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class Parser
{
    // instance variables - replace the example below with your own
    private CommandWords commands;
    private Scanner scanner;

    /**
     * Constructor for objects of class Parser
     */
    public Parser()
    {
        commands = new CommandWords();
        scanner = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Command getCommand()
    {
        String input = "";
        String w1;
        String w2;
        
        System.out.print(":: "); //prompt
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            input = reader.readLine();
        }
        catch(java.io.IOException exc)
        {
            System.out.println("Error reading: " + exc.getMessage());
        }
        
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
        
        //ignore everything else
        
        Command command = commands.getCommand(w1);
        if(command != null)
        {
            command.setSecondWord(w2);
        }
        
        return command;
    }
}
