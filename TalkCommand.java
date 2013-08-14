
/**
 * Write a description of class TalkCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TalkCommand extends Command
{
    // instance variables - replace the example below with your own
    private int x;

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
    public boolean execute(Player p)
    {
        System.out.println("Talk");
        return false;
    }
}
