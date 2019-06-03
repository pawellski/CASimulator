/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import GUI.Observator;
import Grid.Cell;
import Grid.Grid;
import java.util.ArrayList;

/**
 *
 * @author Paweł
 */
public abstract class CellularAutomaton implements Observable {

    protected Grid mainGrid;
    protected Grid utilGrid;

    private ArrayList<Observator> observers;

    @Override
    public void addObservator(Observator o) {
        observers.add(o);
    }

    public Grid getMainGrid() {
        return mainGrid;
    }

    public void setMainGrid(Grid mainGrid) {
        this.mainGrid = mainGrid;
    }
    

    @Override
    public void removeObservator(Observator o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservator() {
        for (Observator o : observers) {
            o.onUpdate();
        }
    }

    public CellularAutomaton(int hei, int wi) {
        mainGrid = new Grid(hei, wi);
        utilGrid = new Grid(hei, wi);
        clearGrid(mainGrid.getGameGrid());
        observers = new ArrayList<Observator>();
    }

    public CellularAutomaton(Cell[][] grid) {
        mainGrid = new Grid();
        mainGrid.setGameGrid(grid);
        utilGrid = new Grid(mainGrid.getHeight(), mainGrid.getWidth());
        observers = new ArrayList<Observator>();
    }

    /*public Cell getCellFromGrid(int i, int j) {
        return mainGrid.gameGrid[i][j];
    }

    public void setCellFromGrid(int i, int j, Cell state) {
        this.mainGrid.gameGrid[i][j] = state;
    }*/

    public void changeGrid() {
        for (int i = 0; i < mainGrid.getHeight(); i++) {
            for (int j = 0; j < mainGrid.getWidth(); j++) {
                mainGrid.setGameGridCell(i, j, utilGrid.getGameGridCell(i, j));
            }
        }
    }

    protected void printToScreen() {
        for (int i = 1; i < mainGrid.getHeight() - 1; i++) {
            for (int j = 1; j < mainGrid.getWidth() - 1; j++) {
                System.out.print(mainGrid.getGameGridCell(i, j) + " ");
            }
            System.out.println();
        }
    }

    public abstract void clearGrid(Cell[][] gridToClear);

    public abstract void generateAll(int generationCount);

    public abstract Cell cellState(int i, int j);
}
