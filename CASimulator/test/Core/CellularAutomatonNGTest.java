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
public class CellularAutomatonNGTest {

    private CellularAutomaton instanceWW;
    private CellularAutomaton instanceGOL;

    public CellularAutomatonNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        this.instanceWW = new WireWorld(3, 3);
        this.instanceGOL = new GameOfLife(3, 3);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of resizeGameGrid method, of class CellularAutomaton.
     */
    @Test
    public void testResizeGameGrid() {
        System.out.println("resizeGameGrid");
        int hei = 10;
        int wi = 10;
        
        instanceWW.resizeGameGrid(hei, wi);
        assertTrue((instanceWW.mainGrid.getHeight() == hei) && (instanceWW.mainGrid.getWidth() == wi));
        
        hei = 1;
        wi = 1;
        
        instanceGOL.resizeGameGrid(hei, wi);
        assertTrue((instanceGOL.mainGrid.getHeight() == hei) && (instanceGOL.mainGrid.getWidth() == wi));
    }

    /**
     * Test of changeGrid method, of class CellularAutomaton.
     */
    @Test
    public void testChangeGrid() {
        System.out.println("changeGrid");
        for (int i = 0; i < instanceWW.mainGrid.getHeight() - 1; i++) {
            for (int j = 0; j < instanceWW.mainGrid.getWidth() - 1; j++) {
                instanceWW.mainGrid.setGameGridCell(i, j, Cell.EHEAD);
            }
        }
        for (int i = 0; i < instanceWW.utilGrid.getHeight() - 1; i++) {
            for (int j = 0; j < instanceWW.utilGrid.getWidth() - 1; j++) {
                instanceWW.utilGrid.setGameGridCell(i, j, Cell.ETAIL);
            }
        }
        instanceWW.changeGrid();
        assertTrue(Arrays.deepEquals(instanceWW.mainGrid.getGameGrid(), instanceWW.utilGrid.getGameGrid()));
        
        for (int i = 0; i < instanceGOL.mainGrid.getHeight() - 1; i++) {
            for (int j = 0; j < instanceGOL.mainGrid.getWidth() - 1; j++) {
                instanceGOL.mainGrid.setGameGridCell(i, j, Cell.ALIVE);
            }
        }
        for (int i = 0; i < instanceGOL.utilGrid.getHeight() - 1; i++) {
            for (int j = 0; j < instanceGOL.utilGrid.getWidth() - 1; j++) {
                instanceGOL.utilGrid.setGameGridCell(i, j, Cell.DEAD);
            }
        }
        instanceGOL.changeGrid();
        assertTrue(Arrays.deepEquals(instanceGOL.mainGrid.getGameGrid(), instanceGOL.utilGrid.getGameGrid()));

    }

    /**
     * Test of isGridChanging method, of class CellularAutomaton.
     */
    @Test
    public void testcheckGrid() {
        System.out.println("isGridChanging");
        for (int i = 0; i < instanceWW.mainGrid.getHeight(); i++) {
            for (int j = 0; j < instanceWW.mainGrid.getWidth(); j++) {
                instanceWW.mainGrid.setGameGridCell(i, j, Cell.WIRE);
            }
        }
        for (int i = 0; i < instanceWW.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instanceWW.utilGrid.getWidth(); j++) {
                instanceWW.utilGrid.setGameGridCell(i, j, Cell.ETAIL);
            }
        }
        instanceWW.checkGrid();
        assertTrue(instanceWW.isIsGridChanging());
        
        for (int i = 0; i < instanceWW.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instanceWW.utilGrid.getWidth(); j++) {
                instanceWW.utilGrid.setGameGridCell(i, j, Cell.WIRE);
            }
        }
        instanceWW.checkGrid();
        assertFalse(instanceWW.isIsGridChanging());
        
        for (int i = 0; i < instanceGOL.mainGrid.getHeight(); i++) {
            for (int j = 0; j < instanceGOL.mainGrid.getWidth(); j++) {
                instanceGOL.mainGrid.setGameGridCell(i, j, Cell.DEAD);
            }
        }
        for (int i = 0; i < instanceGOL.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instanceGOL.utilGrid.getWidth(); j++) {
                instanceGOL.utilGrid.setGameGridCell(i, j, Cell.ALIVE);
            }
        }
        instanceGOL.checkGrid();
        assertTrue(instanceGOL.isIsGridChanging());
        
        for (int i = 0; i < instanceGOL.utilGrid.getHeight(); i++) {
            for (int j = 0; j < instanceGOL.utilGrid.getWidth(); j++) {
                instanceGOL.utilGrid.setGameGridCell(i, j, Cell.DEAD);
            }
        }
        instanceGOL.checkGrid();
        assertFalse(instanceGOL.isIsGridChanging());
    }

}
