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
public class GameOfLife extends CellularAutomaton{
    
    /*ArrayList<Observator> obserwatorzy;*/

    public GameOfLife(int wi, int hei) {
        super(wi, hei);
    }

    public GameOfLife(Cell[][] grid) {
        super(grid);
    }

    @Override
    public void generateAll(int generationCount) {
        for (int it = 0; it < generationCount; it++) {
            for (int i = 1; i < mainGrid.gameGrid.length - 1; i++) {
                for (int j = 1; j < mainGrid.gameGrid[i].length - 1; j++) {
                    utilGrid.gameGrid[i][j] = cellState(i, j);
                }
            }
            System.out.println("Plansza po " + (it + 1) + " generacji.");
            printToScreen();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

                System.out.println("np. zostałem obudzony przedwcześnie");
            }
            clearGrid(mainGrid.gameGrid);
            changeGrid();
            clearGrid(utilGrid.gameGrid);
        }
    }

    @Override
    public Cell cellState(int i, int j) {
        int aliveNumber = 0;
        for (int a = -1; a < 2; a++) {
            for (int b = -1; b < 2; b++) {
                if (mainGrid.gameGrid[i + a][j + b] == Cell.ALIVE) {
                    aliveNumber++;
                }
            }
        }
        if (mainGrid.gameGrid[i][j] == Cell.ALIVE) {
            aliveNumber--;
            if (aliveNumber == 2 || aliveNumber == 3) {
                return Cell.ALIVE;
            } else {
                return Cell.DEAD;
            }
        } else {
            if (aliveNumber == 3) {
                return Cell.ALIVE;
            } else {
                return Cell.DEAD;
            }
        }
    }
   
    @Override
    public void clearGrid(Cell[][] gridToClear) {
        for (int i = 0; i < gridToClear.length; i++) {
            for (int j = 0; j < gridToClear[i].length; j++) {
                gridToClear[i][j] = Cell.DEAD;
            }
        }
    }
    
}
