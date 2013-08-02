
/**
 * This class is the main class for playing Battleships.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (July 2013)
 */
public class Game
{
    private Parser parser;

    /**
     * Create the game and initialise the grids
     */
    public Game()
    {
        parser = new Parser();
    }

    /**
     * Create grids
     */
    private void createGrids()
    {
        
    }
    
    /**
     * Main play routine. Loops until one player's fleet is sunk.
     */
    public void play()
    {
        printOpening();
    }
    
    /**
     * Opening statement
     */
    private void printOpening()
    {
        System.out.println();
        System.out.println("Welcome to Battleships");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
    }
}
