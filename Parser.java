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
    //private String w2;
    //private String w3;

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
        input = "";
        
        //prompt
        System.out.print(":: "); 
        
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
        
        //do a check for the string command
            
        //do a check for the int command
        
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
        
        if(tokenizer.hasMoreTokens())
        {
            w3 = tokenizer.nextToken(); //Word 3
        }
        else
        {
            w3 = null;
        }
        */

        Command command = commands.getCommand(w1);
        if(command != null)
        {
            command.setSecondWord(theRest);
            //command.setThirdWord(w3);
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
     * Get word 3 as string
     
    public String getW3()
    {
        return w3;
    }*/
    
    /**
     * Get CommandWords
     */
    public CommandWords getCommandWords()
    {
        return commands;
    }
}
