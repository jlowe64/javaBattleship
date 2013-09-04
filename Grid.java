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
    private int grid1[][];
    private int grid2[][];
    int x;
    int y;
    int size;

    /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
        size = 10;
        grid1 = new int[size][size];
        grid2 = new int[size][size];
        fillArray(grid1);
        fillArray(grid2);
    }

    /**
     * Add Ship from fleet
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addShipFromFleet(Ship s)
    {
        //
    }
    
    /**
     * 
     */
    public void fillArray(int a[][])
    {
        // Fill each row with 0
        for (int[] row: a)
        {
            Arrays.fill(a, 0);
        }
    }
    
    /**
     * Print grid
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printGrid(int a[][])
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(a[i][j] == 1)
                {
                    grid1[i][j] = x;
                }
                System.out.print(a[i][j]);
            }
        }
    }
}
