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
public class WireWorldNGTest {

    private WireWorld instance;

    public WireWorldNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        this.instance = new WireWorld(3, 3);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of cellState method, of class WireWorld.
     */
    @Test
    public void testCellState() {
        System.out.println("cellState");
        instance = new WireWorld(5, 5);
        Cell expResult = Cell.EMPTY;
        Cell result = instance.cellState(2, 2);
        assertEquals(result, expResult);

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                instance.mainGrid.setGameGridCell(i, j, Cell.WIRE);
            }
        }
        expResult = Cell.WIRE;
        result = instance.cellState(2, 2);
        assertEquals(result, expResult);

        instance.mainGrid.setGameGridCell(1, 1, Cell.EHEAD);
        expResult = Cell.EHEAD;
        result = instance.cellState(2, 2);
        assertEquals(result, expResult);

        instance.mainGrid.setGameGridCell(1, 2, Cell.EHEAD);
        expResult = Cell.EHEAD;
        result = instance.cellState(2, 2);
        assertEquals(result, expResult);

        instance.mainGrid.setGameGridCell(1, 3, Cell.EHEAD);
        expResult = Cell.WIRE;
        result = instance.cellState(2, 2);
        assertEquals(result, expResult);
        
        expResult = Cell.ETAIL;
        result = instance.cellState(1, 1);
        assertEquals(result, expResult);
        
        instance.mainGrid.setGameGridCell(1, 3, Cell.ETAIL);
        expResult = Cell.WIRE;
        result = instance.cellState(1, 3);
        assertEquals(result, expResult);

    }

    /**
     * Test of generate method, of class WireWorld.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        instance = new WireWorld(5,5);
        instance.clearGrid(instance.utilGrid.getGameGrid());
        instance.mainGrid.setGameGridCell(1, 1, Cell.ETAIL);
        instance.mainGrid.setGameGridCell(2, 1, Cell.ETAIL);
        instance.mainGrid.setGameGridCell(3, 1, Cell.ETAIL);
        instance.mainGrid.setGameGridCell(1, 2, Cell.EHEAD);
        instance.mainGrid.setGameGridCell(3, 2, Cell.EHEAD);
        instance.mainGrid.setGameGridCell(2, 3, Cell.WIRE);
        
        WireWorld expResult = new WireWorld(5,5);
        expResult.mainGrid.setGameGridCell(1, 1, Cell.WIRE);
        expResult.mainGrid.setGameGridCell(2, 1, Cell.WIRE);
        expResult.mainGrid.setGameGridCell(3, 1, Cell.WIRE);
        expResult.mainGrid.setGameGridCell(1, 2, Cell.ETAIL);
        expResult.mainGrid.setGameGridCell(3, 2, Cell.ETAIL);
        expResult.mainGrid.setGameGridCell(2, 3, Cell.EHEAD);
        
        instance.generate();
        
        assertTrue(Arrays.deepEquals(expResult.mainGrid.getGameGrid(), instance.mainGrid.getGameGrid()));
    }

    /**
     * Test of clearGrid method, of class WireWorld.
     */
    @Test
    public void testClearGrid() {
        System.out.println("clearGrid");

        Cell[][] gridToClear = instance.mainGrid.getGameGrid();
        instance.clearGrid(gridToClear);
        for (int i = 0; i < instance.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instance.utilGrid.getWidth(); j++) {
                instance.utilGrid.setGameGridCell(i, j, Cell.EMPTY);
            }
        }
        assertTrue(Arrays.deepEquals(gridToClear, instance.utilGrid.getGameGrid()));
        instance.clearGrid(gridToClear);
        for (int i = 0; i < instance.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instance.utilGrid.getWidth(); j++) {
                instance.utilGrid.setGameGridCell(i, j, Cell.WIRE);
            }
        }
        assertFalse(Arrays.deepEquals(gridToClear, instance.utilGrid.getGameGrid()));

    }

}
