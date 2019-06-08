/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Grid.Cell;
import java.util.Arrays;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kuba
 */
public class GameOfLifeNGTest {

    private GameOfLife instance;

    public GameOfLifeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        this.instance = new GameOfLife(3, 3);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of generate method, of class GameOfLife.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        instance = new GameOfLife(5, 5);
        instance.clearGrid(instance.utilGrid.getGameGrid());
        instance.mainGrid.setGameGridCell(1, 1, Cell.ALIVE);
        instance.mainGrid.setGameGridCell(1, 3, Cell.ALIVE);
        instance.mainGrid.setGameGridCell(2, 2, Cell.ALIVE);
        instance.mainGrid.setGameGridCell(3, 1, Cell.ALIVE);
        instance.mainGrid.setGameGridCell(3, 3, Cell.ALIVE);
        
        GameOfLife expResult = new GameOfLife(5, 5);
        expResult.mainGrid.setGameGridCell(1, 2, Cell.ALIVE);
        expResult.mainGrid.setGameGridCell(2, 1, Cell.ALIVE);
        expResult.mainGrid.setGameGridCell(2, 3, Cell.ALIVE);
        expResult.mainGrid.setGameGridCell(3, 2, Cell.ALIVE);
        
        instance.generate();
        
        for(int i = 0; i < instance.mainGrid.getHeight(); i++){
            for(int j = 0; j < instance.mainGrid.getWidth(); j++){
                System.out.println(instance.mainGrid.getGameGridCell(i, j));
            }
        }
        
        assertTrue(Arrays.deepEquals(expResult.mainGrid.getGameGrid(), instance.mainGrid.getGameGrid()));
        
    }

    /**
     * Test of cellState method, of class GameOfLife.
     */
    @Test
    public void testCellState() {
        System.out.println("cellState");
        instance = new GameOfLife(5, 5);
        Cell expResult = Cell.DEAD;
        Cell result = instance.cellState(2, 2);
        assertEquals(result, expResult);
        
        instance.mainGrid.setGameGridCell(1, 1, Cell.ALIVE);
        expResult = Cell.DEAD;
        result = instance.cellState(1, 1);
        assertEquals(result, expResult);
        
        expResult = Cell.DEAD;
        result = instance.cellState(1, 2);
        assertEquals(result, expResult);
        
        instance.mainGrid.setGameGridCell(1, 2, Cell.ALIVE);
        expResult = Cell.DEAD;
        result = instance.cellState(1, 1);
        assertEquals(result, expResult);
        
        expResult = Cell.DEAD;
        result = instance.cellState(2, 1);
        assertEquals(result, expResult);
        
        instance.mainGrid.setGameGridCell(2, 1, Cell.ALIVE);
        expResult = Cell.ALIVE;
        result = instance.cellState(1, 1);
        assertEquals(result, expResult);
        
        expResult = Cell.ALIVE;
        result = instance.cellState(2, 2);
        assertEquals(result, expResult);
        
    }

    /**
     * Test of clearGrid method, of class GameOfLife.
     */
    @Test
    public void testClearGrid() {
        System.out.println("clearGrid");
        Cell[][] gridToClear = instance.mainGrid.getGameGrid();
        instance.clearGrid(instance.mainGrid.getGameGrid());
        for (int i = 0; i < instance.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instance.utilGrid.getWidth(); j++) {
                instance.utilGrid.setGameGridCell(i, j, Cell.DEAD);
            }
        }

        assertTrue(Arrays.deepEquals(gridToClear, instance.utilGrid.getGameGrid()));

        instance.clearGrid(instance.mainGrid.getGameGrid());
        for (int i = 0; i < instance.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instance.utilGrid.getWidth(); j++) {
                instance.utilGrid.setGameGridCell(i, j, Cell.ALIVE);
            }
        }
        assertFalse(Arrays.deepEquals(gridToClear, instance.utilGrid.getGameGrid()));

    }

}
