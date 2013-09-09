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
    private String input;
    private String w1;
    private String theRest;

    /**
     * Constructor for objects of class Parser
     */
    public Parser()
    {
        commands = new CommandWords();
    }

    /**
     * Get commands
     * 
     * @return     the command 
     */
    public Command getCommand()
    {
        input = new String("");
        
        //prompt
        System.out.print(">> "); 
        
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
        
        //store the rest as a string if there are more
        while(tokenizer.hasMoreTokens())
        {
            theRest += " " + tokenizer.nextToken();
        }
        
        /*
        if(tokenizer.hasMoreTokens())
        {
            w2 = tokenizer.nextToken(); //Word 2
        }
        else
        {
            w2 = null;
        }
        */

        Command command = commands.getCommand(w1);
        if(command != null)
        {
            command.setSecondWord(theRest);
        }
        
        return command;
    }
    
    /**
     * Get word 1 as string
     */
    public String getW1()
    {
        return w1;
    }
    
    /**
     * Get word 2 as string
     */
    public String getW2()
    {
        return theRest;
    }
    
    /**
     * Get CommandWords
     */
    public CommandWords getCommandWords()
    {
        return commands;
    }
}
