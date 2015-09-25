import java.util.*;

/**
 * CommandWords holds all subclasses for Commands
 * 
 * @author Jerrett Fowler   
 * @version 1.0 (August 2013)
 */
public class CommandWords 
{
    // variables
    
    // Use final to protect against nulls and for general stability
    private final HashMap<String,Command> commands = new HashMap<String,Command>();
    
    /**
     * Constructor for objects of class CommandWords
     */
    public CommandWords()
    {
        // Add commands
        commands.put("START", new StartCommand());
        commands.put("SUPPORTS", new SupportsCommand());
        commands.put("YES", new YesCommand());
        commands.put("NO", new NoCommand());
        commands.put("END", new EndCommand());
        commands.put("FIRSTGO", new FirstGoCommand());
        commands.put("READY", new ReadyCommand());
        commands.put("TALK", new TalkCommand());
        commands.put("FIRE", new FireCommand());
        commands.put("MISS", new MissCommand());
        commands.put("HIT", new HitCommand());
        commands.put("SUNK", new SunkCommand());
        commands.put("ILOSE", new ILoseCommand());
        commands.put("SHIP", new ShipCommand());
        commands.put("STRING", new StringCommand());
        commands.put("INT", new IntCommand());
        commands.put("HELP", new HelpCommand());
        commands.put("PLACE", new PlaceCommand());
    }
    
    // Method to check if command is valid
    
    /**
     * Method to return command
     */
    public Command getCommand(String s)
    {
        return commands.get(s);
    }
    
    // Method to List all commands
    /**
     * Method to print all commands
     */
    public void printCommands()
    {
        Iterator<Map.Entry<String, Command>> iterator = commands.entrySet().iterator();
 
        while(iterator.hasNext())
        {
            Map.Entry<String, Command> pairs = iterator.next();
            System.out.println(pairs.getKey());
        }
    }
}
