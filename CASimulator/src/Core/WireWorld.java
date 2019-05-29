/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Grid.Cell;

/**
 *
 * @author Jakub
 */
public class WireWorld extends CellularAutomaton {
    
    public WireWorld(int wi, int hei) {
        super(wi, hei);
    }

    public WireWorld(Cell[][] grid) {
        super(grid);
    }

    @Override
    public Cell cellState(int i, int j) {
        int electronHeadNumber = 0;
        switch (mainGrid.gameGrid[i][j]) {
            case EMPTY: 
                return Cell.EMPTY;
            case WIRE: 
                for (int a = -1; a < 2; a++) {
                    for (int b = -1; b < 2; b++) {
                        if (mainGrid.gameGrid[i + a][j + b] == Cell.EHEAD) {
                            electronHeadNumber++;
                        }
                    }
                }
                if (electronHeadNumber == 1 || electronHeadNumber == 2) {
                    return Cell.EHEAD;
                } else {
                    return Cell.WIRE;
                }
            case EHEAD: 
                return Cell.ETAIL;
            case ETAIL: 
                return Cell.WIRE;

        }
        return Cell.EMPTY;
    }

    @Override
    public void generateAll(int generationCount) {
        for (int it = 0; it < generationCount; it++) {
            for (int i = 1; i < this.mainGrid.gameGrid.length - 1; i++) {
                for (int j = 1; j < this.mainGrid.gameGrid[i].length - 1; j++) {
                    this.utilGrid.gameGrid[i][j] = cellState(i, j);
                }
            }
            System.out.println("Plansza po " + (it + 1) + " generacji.");
            clearGrid(this.mainGrid.gameGrid);
            changeGrid();
            clearGrid(this.utilGrid.gameGrid);
        }
    }
    
    @Override
    public void clearGrid(Cell[][] gridToClear) {
        for (int i = 0; i < gridToClear.length; i++) {
            for (int j = 0; j < gridToClear[i].length; j++) {
                gridToClear[i][j] = Cell.EMPTY;
            }
        }
    }
}
