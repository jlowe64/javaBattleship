import java.io.*;
import java.net.*;

/**
 * Client for Battleship
 * 
 * @author Jerrett Fowler
 * @version 1.0 (August 2013)
 */
public class Client
{
    public static void main(String[] args) throws IOException 
    {

        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            socket = new Socket("aloha", 4444);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Host does not exist: aloha.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("No I/O for the connection to: aloha.");
            System.exit(1);
        }

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String fromServer;
        String fromUser;

        while ((fromServer = in.readLine()) != null) {
            System.out.println("Server: " + fromServer);
            if (fromServer.equals("Bye."))
                break;
		    
            fromUser = stdIn.readLine();
	    if (fromUser != null) {
                System.out.println("Client: " + fromUser);
                out.println(fromUser);
	    }
        }

        out.close();
        in.close();
        stdIn.close();
        socket.close();
    }
}
