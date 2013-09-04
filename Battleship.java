import java.awt.event.*; // Use some events
//import java.awt.*; // Graphics
//import javax.swing.*; // Use swing for GUI
import java.util.*; // Util
import java.io.*; //I/O
import java.net.*; //Sockets

/**
 * This class is the main class for playing Battleships.
 * 
 * @author Jerrett Fowler 
 * @version 1.2 (August 2013)
 */

//public class Battleship extends JFrame implements MouseListener, WindowListener    
public class Battleship
{
    private Parser parser;
    private Protocol protocol;
    Player currentPlayer;

    /**
     * Main
     */
    public static void main(String[] args) throws IOException
    {
        int i = 0, portArg;
        String arg, machine;
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
        //createGrids();
        
        switch(gameState)
        {
            case "Client":
                client(serverName, portNumber);
                //player sets up grids, sends <READY> message
                play();
                System.out.println("Client Breaks");
                break;

            case "Host":
                host(portNumber);
                //host randomly decides <FIRSTGO> and sends message to user on decision
                //player sets up grids, sends <READY> message
                play();
                System.out.println("Host Breaks");
                break;
                
            default: System.err.println("That went wrong");
        }
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
        System.out.println();
        System.out.println();
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
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Sorry to see you go soldier.");
        System.out.println("Game has ended.");
        System.out.println();
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
        
        while(!end)
        {
            //responds to <SUPPORTS> message with <YES> or <NO> to each
            //items set as <NO> will go unsupported on the host
            end = END.execute(getPlayer());
            if (end == true)
            {
                try {
                    connection.close();
                } catch (IOException e) {
                    System.err.println("Could not find close connection.");
                }
            }
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
        
        while(!end)
        {
            try {
                System.out.println("Waiting on connection...");
                client = server.accept();
                OutputStream out = client.getOutputStream();
                InputStream in  = client.getInputStream();
            } catch (IOException e) {
                System.err.println("Cannot accept connection. Failed.");
                System.exit(1);
            }
      
            START.execute(getPlayer());
            //sends <START> message to client
            //sends a <SUPPORTS> message to client for each feature used
            //when host cycles through all <SUPPORTS>, it sends an <END>
            
            end = END.execute(getPlayer());
            
            if (end == true)
            {
                try {
                    server.close();
                } catch (IOException e) {
                    //
                }
            }
        }
        
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
        Fleet fleet = new Fleet();
    }

    /**
     * Create grids
     */
    private void createGrids()
    {
        // Create player grid
        Grid grids = new Grid();
    }
    
    /**
     * Start of program
     
    public void init()
    {
        setSize(256, 256);
    }*/
    
    /**
     * Mouse Event Overrides
     */
    //public void mouseClicked(MouseEvent event) {}
    //public void mouseEntered(MouseEvent event) {}
    //public void mouseExited(MouseEvent event) {}
    //public void mousePressed(MouseEvent event) {}
    //public void mouseReleased(MouseEvent event) {}
    
    /**
     * GFX Event Overrides
     */
    //public void windowActivated(WindowEvent event) {}
    //public void windowClosed(WindowEvent event) {}
    //public void windowClosing(WindowEvent event) {}
    //public void windowDeactivated(WindowEvent event) {}
    //public void windowDeiconified(WindowEvent event) {}
    //public void windowIconified(WindowEvent event) {}
    //public void windowOpened(WindowEvent event) {}
}
