import java.awt.event.*; // Use some events
import java.util.*; // Util
import java.io.*; //I/O
import java.net.*; //Sockets

/**
 * This class is the main class for playing Battleships.
 * 
 * @author Jerrett Fowler 
 * @version 1.2 (August 2013)
 */
 
public class Battleship
{
    
    private enum GameState
    {
        INITIALISE, SERVERREADY, SERVERTURN
    }
    
    private GameState gameState = GameState.INITIALISE;
    private Parser parser;
    private Protocol protocol;
    Player currentPlayer;
    Grid grids;
    Fleet fleet;

    /**
     * Main
     */
    public static void main(String[] args) throws IOException
    {
        int i = 0, portArg;
        String arg = new String(); 
        String machine = new String();
        boolean vflag = false;
        while (i < args.length && args[i].startsWith("-"))
        {
            arg = args[i++];
            if(arg.equals("-host"))
            {
                if (i < args.length)
                {
                    System.out.println("Host");
                    portArg = Integer.parseInt(args[i++]);
                    new Battleship("Host","", portArg);
                }
                else
                {
                    System.err.println("-host requires a port number");
                }
            }
            else if(arg.equals("-join"))
            {
                if (i < args.length)
                {
                    System.out.println("Client");
                    machine = args[i++];
                    portArg = Integer.parseInt(args[i++]);
                    new Battleship("Client", machine, portArg);
                }
                else
                {
                    System.err.println("-host requires a port number");
                }
            }
            else
            {
                System.err.println("Format: java Battleship [-host/-join] [Machine Name] [Port number]");
                
            }
        }
    }
   
    /**
     * Create the game and initialise the grids
     */
    public Battleship(String gameState, String serverName, int portNumber)
    {
        parser = new Parser();
        protocol = new Protocol();
        //create player
        setPlayer();
        //set up fleet
        newFleet();
        //set up new grids
        createGrids();
        
        switch(gameState)
        {
            case "Client":
                client(serverName, portNumber);
                //player sets up grids, sends <READY> message
                System.out.println("Client Breaks");
                break;

            case "Host":
                host(portNumber);
                //host randomly decides <FIRSTGO> and sends message to user on decision
                //player sets up grids, sends <READY> message
                System.out.println("Host Breaks");
                break;
                
            default: System.err.println("That went wrong");
        }
    }
    
    /**
     * Start Client
    */ 
    public void client(String serverName, int portNumber)
    {
        System.out.println("Gamestate = Client");
        Socket connection = null;
        //PrintWriter out = null;
        //BufferedReader in = null;
        boolean end = false;
        
        Command YES = protocol.getCommand("YES");
        Command NO = protocol.getCommand("NO");
        Command END = protocol.getCommand("END");
                
        //sends connection request to host
        try {
            System.out.println("Client tries connection on port: " + portNumber);
            connection = new Socket(serverName, portNumber);
            System.out.println("Connection established");
        } catch (IOException e) {
            System.err.println("Could not find server. Try again.");
            System.exit(1);
        }
        
        //responds to <SUPPORTS> message with <YES> or <NO> to each
        //items set as <NO> will go unsupported on the host
        
        //Play Game
        play();
        
        try {
            connection.close();
        } catch (IOException e) {
            System.err.println("Could not find close connection.");
        }
        //out.close();
        //in.close();
        
        //connectionToTheServer.close();
    }
    
    /**
     * Start Server
     */
    public void host(int portNumber)
    {
        System.out.println("Gamestate = Host");
        //Creates ServerSocket
        ServerSocket server = null;
        boolean end = false;
        
        Command START = protocol.getCommand("START");
        Command SUPPORTS = protocol.getCommand("SUPPORTS");
        Command YES = protocol.getCommand("YES");
        Command NO = protocol.getCommand("NO");
        Command END = protocol.getCommand("END");
        
        try {
            server = new ServerSocket(portNumber);
            System.out.println("Host set up on port: " + portNumber);
        } catch (IOException e) {
            System.err.println("Could not listen on port: " +portNumber);
            System.exit(1);
        }
    
        //listens for connection request
        Socket client = null;
        
        try {
                System.out.println("Waiting on connection...");
                client = server.accept();
                OutputStream out = client.getOutputStream();
                InputStream in  = client.getInputStream();
        } catch (IOException e) {
                System.err.println("Cannot accept connection. Failed.");
                System.exit(1);
        }
        //START.execute(getPlayer());
        //sends <START> message to client
        //sends a <SUPPORTS> message to client for each feature used
        //when host cycles through all <SUPPORTS>, it sends an <END>
        
        //Play Game
        play();
        
        try {
                server.close();
        } catch (IOException e) {
                //
        }
    }
    
    /**
     * Main play routine. Loops until one player's fleet is sunk.
     */
    public void play()
    {
        printOpening();
        
        System.out.println("                 GAME BOARD");
        
        if(gameState == GameState.INITIALISE) //change this when READY works
        {
            grids.addShipFromFleet(fleet.getShipInFleet("SUBMARINE1"));
            grids.addShipFromFleet(fleet.getShipInFleet("SUBMARINE2"));
            grids.addShipFromFleet(fleet.getShipInFleet("SUBMARINE3"));
            grids.addShipFromFleet(fleet.getShipInFleet("BATTLESHIP1"));
            grids.addShipFromFleet(fleet.getShipInFleet("DESTROYER1"));
            grids.addShipFromFleet(fleet.getShipInFleet("DESTROYER2"));
            grids.printGrid();
        }
    
        System.out.println();
        System.out.println("Board is set up for you. Command for Placing a ship is not fully implemented.");
        
        //Main gameplay loop
        while(!getPlayer().getEnd())
        {
            
            Command command = parser.getCommand();
            
            if(command == null)
            {
                System.out.println("Please enter your orders again, ");
                System.out.println("and remember that orders are in ALL CAPS...");
            }
            
            else if(command.getName().equals("READY"))
            {
                if(gameState == GameState.INITIALISE)
                {
                    command.execute(getPlayer());
                }
                else
                {
                    System.out.println("Already ready...?");
                }
            }
            
            else if(command.getName().equals("END"))
            {
                command.execute(getPlayer());
            }
            
            else if(command.getName().equals("HELP"))
            {
                command.execute(parser.getCommandWords()); 
            }
            
            else if(command.getName().equals("TALK"))
            {
                command.execute(getPlayer()); 
                
                //send message to other player
            }
            
            else if(command.getName().equals("FIRE"))
            {
                command.execute(getPlayer()); 
                
                //send message to other player
            }
            
            else if(command.getName().equals("MISS"))
            {
                command.execute(getPlayer());
            
                //send message to other player
            }
            
            else if(command.getName().equals("HIT"))
            {
                command.execute(getPlayer());
       
                //edit Grid
                
                //send message to other player
            }
            
            else if(command.getName().equals("SUNK"))
            {
                command.execute(getPlayer());
                
                //remove ship from ArrayList
            
                //send message to other player
            }
            
            else if(command.getName().equals("ILOSE"))
            {
                command.execute(getPlayer());
            
                //send message to other player
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
        System.out.println();
        System.out.println("Welcome to Battleships!");
        System.out.println("Type 'HELP' if you need help.");
        System.out.println("All commands are in ALL CAPS.");
        System.out.println();
    }
    
    /**
     * Closing statement
     */
    private void printClosing()
    {
        System.out.println();
        System.out.println();
        System.out.println("Sorry to see you go soldier.");
        System.out.println("Game has ended.");
        System.out.println();
    }
    
    /**
     * A new player
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
        fleet = new Fleet();
    }

    /**
     * Create grids
     */
    private void createGrids()
    {
        // Create player grid
        grids = new Grid();
        
       
    }
}
