import java.awt.event.*; // Use some events
import java.awt.*; // Graphics
import java.applet.*; // Applets
import javax.swing.*; // Use swing for GUI
import java.util.*; // Util

/**
 * This class is the main class for playing Battleships.
 * 
 * @author Jerrett Fowler 
 * @version 1.0 (July 2013)
 */
public class Game extends JApplet
{
    private Parser parser;
    Player currentPlayer;
    
    /**
     * Create the game and initialise the grids
     */
    public Game()
    {
        parser = new Parser();
        //create player
        newPlayer();
        
        //set up fleet
        newFleet();
    }
    
    /**
     * A new player has emerged
     */
    public void newPlayer()
    {
        Player player = new Player("Player");
    }
    
    /**
     * Engage your Fleet
     */
    public void newFleet()
    {
        Fleet fleet = new Fleet();
    }

    /**
     * Create grids
     */
    private void createGrids()
    {
        // Create player grid
        
        // Create reference grid
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
    
    /**
     * Start of program
     */
    public void init()
    {
        setSize(256, 256);
    }
}
