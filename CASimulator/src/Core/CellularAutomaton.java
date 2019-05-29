/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Grid.Cell;
import Grid.Grid;

/**
 *
 * @author Paweł
 */
public class CellularAutomaton {

    public Grid mainGrid;
    protected Grid utilGrid;

    public CellularAutomaton(int wi, int hei) {
        mainGrid = new Grid(hei, wi);
        utilGrid = new Grid(hei, wi);
        clearGrid(mainGrid.gameGrid);
    }

    public CellularAutomaton(Cell[][] grid) {
        mainGrid = new Grid();
        mainGrid.gameGrid = grid;
        utilGrid = new Grid(mainGrid.gameGrid.length, mainGrid.gameGrid[0].length);
    }

    public void clearGrid(Cell[][] gridToClear) {
        for (int i = 0; i < gridToClear.length; i++) {
            for (int j = 0; j < gridToClear[i].length; j++) {
                gridToClear[i][j] = Cell.DEAD;
            }
        }
    }

    public void changeGrid() {
        for (int i = 0; i < mainGrid.gameGrid.length; i++) {
            for (int j = 0; j < mainGrid.gameGrid[i].length; j++) {
                mainGrid.gameGrid[i][j] = utilGrid.gameGrid[i][j];
            }
        }
    }

    protected void printToScreen() {
        for (int i = 1; i < mainGrid.gameGrid.length - 1; i++) {
            for (int j = 1; j < mainGrid.gameGrid[i].length - 1; j++) {
                System.out.print(mainGrid.gameGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
