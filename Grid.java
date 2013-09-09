import java.util.*;

/**
 * Write a description of class Grid here.
 * 
 * @author Jerrett Fowler
 * @version 1.1 (September 2013)
 */
public class Grid
{
    // instance variables
    private int[][] grid1;
    private int[][] grid2;
    int size;

    /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
        size = 10;
        grid1 = new int[size][size];
        grid2 = new int[size][size];
    }

    /**
     * Add Ship from fleet
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addShipFromFleet(Ship s)
    {
        //get x
        int xCoord = s.getColumn();
        
        //get y
        int yCoord = s.getRow();
        
        //get direction
        int direction = s.getOrientation();
        
        //get Size
        int shipSize = s.getSize();
        
        if(direction == 0)
        {
            for(int x = 0; x < shipSize; x++)
            {
                grid1[yCoord][xCoord + x] = 1; 
            }
        }
        else if(direction == 1)
        {
            for(int y = 0; y < shipSize; y++)
            {
                grid1[yCoord + y][xCoord] = 1; 
            }
        }
        else
        {
            throw new RuntimeException("Empty case.");
        }
    }
    
    /**
     * Print grid
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printGrid()
    {
        //Loop through rows
        for(int i = 0; i < size; i++)
        {
            //Loops and prints each column
            for(int j = 0; j < size; j++)
            {
                System.out.print(grid1[i][j] == 1 ? "X" : "." );
                System.out.print(" ");
            }
            System.out.print(" ");
            for(int k = 0; k < size; k++)
            {
                System.out.print(grid2[i][k] == 1 ? "X" : "." );
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
