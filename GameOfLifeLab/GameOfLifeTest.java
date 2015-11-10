
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (A: alive; -: blank; D: Dead)
         * 
         *    0 1 2 3 4 5 6 7 8
         *  0 A A D D D D D A A
         *  1 A A D D A D D A A
         *  2 D D D A A A D D D
         *  3 D D D D A D D D D
         *  4 A A D D D D D A A
         *  5 A A D D D D D A A
         */  
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 0) ||
                        (row == 0 && col == 1) ||
                        (row == 0 && col == 5) ||
                        (row == 0 && col == 6) ||
                        (row == 1 && col == 0) ||
                        (row == 1 && col == 1) ||
                        (row == 1 && col == 7) ||
                        (row == 1 && col == 8) ||
                        (row == 1 && col == 3) ||
                        (row == 2 && col == 2) ||
                        (row == 2 && col == 3) ||
                        (row == 2 && col == 4) ||
                        (row == 3 && col == 3) ||
                        (row == 5 && col == 0) ||
                        (row == 5 && col == 1) ||
                        (row == 5 && col == 8) ||
                        (row == 5 && col == 6) ||
                        (row == 4 && col == 0) ||
                        (row == 4 && col == 1) ||
                        (row == 4 && col == 7) ||
                        (row == 4 && col == 8) ||
                        (row == 5 && col == 7))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations
              0 1 2 3 4 5 6 7 8
         *  0 A A D D D D D A A
         *  1 A A D A D A D A A
         *  2 D D D D D D D D D
         *  3 D D D A D A D D D
         *  4 A A D D D D D A A
         *  5 A A D D D D D A A
         */  

        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for(int row = 0; row < ROWS; row++)
            {
                for(int col = 0; col < COLS; col++)
                {
                    // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                    // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 1 && col == 3) ||
                        (row == 1 && col == 5) ||
                        (row == 3 && col == 5) ||
                        (row == 3 && col == 5) ||
                        (row == 0 && col == 0) ||
                        (row == 0 && col == 1) ||
                        (row == 0 && col == 5) ||
                        (row == 0 && col == 6) ||
                        (row == 5 && col == 1) ||
                        (row == 5 && col == 8) ||
                        (row == 5 && col == 6) ||
                        (row == 5 && col == 7)
                        )
                         {
                          assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                        }
                else // else, the cell should be dead; assert that the actor is null
                {
                   assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
        
                            // ...
                        
                        }
                    }
                }
            }

