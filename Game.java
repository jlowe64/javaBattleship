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
        setPlayer();
        
        //set up fleet
        newFleet();
    }
    
    /**
     * A new player has emerged
     */
    public void setPlayer()
    {
        Player player = new Player("Player");
        currentPlayer = player;
    }
    
    /**
     * Return the player
     */
    public Player getPlayer()
    {
        return currentPlayer;
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
        
        boolean end = false;
        
        //Main gameplay loop
        while(!end)
        {
            Command command = parser.getCommand();
            if(command == null)
            {
                System.out.println("Please enter your orders again, ");
                System.out.println("and remember that orders are in ALL CAPS...");
            }
            else
            {
                end = command.execute(getPlayer());
            }
        }
        
        printClosing();
    }
    
    /**
     * Opening statement
     */
    private void printOpening()
    {
        System.out.println();
        System.out.println("Welcome to Battleships!");
        System.out.println("Type 'help' if you need help.");
        System.out.println("All commands are in ALL CAPS.");
        System.out.println();
    }
    
    /**
     * Closing statement
     */
    private void printClosing()
    {
        System.out.println();
        System.out.println("Sorry to see you go soldier.");
        System.out.println("Game has ended.");
        System.out.println();
    }
    
    /**
     * Start of program
     */
    public void init()
    {
        setSize(256, 256);
    }
    
    /**
     * Main menu
     */
    public void mainMenu()
    {
        //scan commands
        Command command = parser.getCommand();
        
        //print menu
        System.out.println();
        System.out.println("Main Menu: ");
        System.out.println("\n1. Join Game");
        System.out.println("\n2. Host Game");
        System.out.println();
        
        int choice = 0; //Link this to the command system
        //switch
        switch (choice)
        {
            //host game
            case 1:
            
            //join game
            case 2:
            
            //default case
            default:
            
            mainMenu();
        }
    }
}
