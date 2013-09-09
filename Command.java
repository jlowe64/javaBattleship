
/**
 * Write a description of class Command here. Command is a SuperClass
 * with many subclasses of Commands.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (July 2013)
 */
public abstract class Command
{
    public String secondWord;
    public String thirdWord;
    
    public Command()
    {
        secondWord = null;
        thirdWord = null;
    }
    
    /**
     * Set secondWord
     * 
     * @param  secondWord   a sample parameter for a method
     * @return     void    no return 
     */
    public void setSecondWord(String secondWord)
    {
        this.secondWord = secondWord;
    }
    
    /**
     * Return second word
     */
    public String getSecondWord()
    {
        return secondWord;
    }
 
    /**
     * Return true if the command has a second word
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
    
    /**
     * Set thirdWord
     * 
     * @param  thirdWord   a sample parameter for a method
     * @return     void    no return 
     */
    public void setThirdWord(String thirdWord)
    {
        this.thirdWord = thirdWord;
    }
    
    /**
     * Return third word
     */
    public String getThirdWord()
    {
        return thirdWord;
    }
 
    /**
     * Return true if the command has a third word
     */
    public boolean hasThirdWord()
    {
        return (thirdWord != null);
    }
    
    /**
     * Return true if conditions are met
     */
    public abstract boolean execute(Object o);
   
    /**
     * Return String of name of command
     */
    public abstract String getName();
}
