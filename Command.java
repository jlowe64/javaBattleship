
/**
 * Write a description of class Command here. Command is a SuperClass
 * with many subclasses of Commands.
 * 
 * @author Jerrett Fowler
 * @version 1.0 (July 2013)
 */
public abstract class Command //Why use abstract: http://stackoverflow.com/questions/7262892/java-best-practices-put-get-subclass-objects-into-hashmap-that-expects-supercla
{
    private String secondWord;

    /**
     * Constructor for objects of class Command
     */
    public Command()
    {
        secondWord = null;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
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
}
