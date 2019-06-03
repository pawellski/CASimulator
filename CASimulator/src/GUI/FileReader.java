/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.CellularAutomaton;
import Grid.Cell;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Kuba
 */
public class FileReader {

    private final File file;
    private Scanner sc;
    private Scanner scColumns;
    private Scanner scRows;
    private int columnsNumber;
    private int rowsNumber;
    private String row;
    private final String automat = "Automat: ";
    private final String grid = "Grid:";
    private String gameType;

    public FileReader(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        this.sc = new Scanner(file);
        this.scColumns = new Scanner(file);
        this.scRows = new Scanner(file);
    }

    public String getGameType() throws NoSuchElementException {
        sc.skip(automat);
        gameType = "Core." + sc.nextLine();
        return gameType;
    }

    public void setScannersInPlace() {
        scColumns.nextLine();
        scColumns.nextLine();
        scRows.nextLine();
        scRows.nextLine();
    }

    public int countNumberOfColumns() {
        row = scColumns.nextLine();
        columnsNumber = row.replace(" ", "").length();
        return columnsNumber;
    }

    public int countNumberOfRows() {
        while (!(scRows.hasNext("/grid"))) {
            rowsNumber++;
            scRows.next();
        }
        return rowsNumber / columnsNumber;
    }

    public void getDimensions() {
        columnsNumber = countNumberOfColumns();
        rowsNumber = countNumberOfRows();
    }

    public void getGridLayout(CellularAutomaton ca) throws NoSuchElementException {
        sc.skip(grid);
        sc.nextLine();
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                if ("Core.WireWorld".equals(gameType)) {
                    switch(sc.nextInt()){
                    case 0:
                        ca.getMainGrid().setGameGridCell(i, j, Cell.EMPTY);
                        break;
                    case 1:
                        ca.getMainGrid().setGameGridCell(i, j, Cell.WIRE);
                        break;
                    case 2:
                        ca.getMainGrid().setGameGridCell(i, j, Cell.EHEAD);
                        break;
                    case 3:
                        ca.getMainGrid().setGameGridCell(i, j, Cell.ETAIL);
                        break;
                    }
                } else {
                    switch (sc.nextInt()) {
                        case 0:
                            ca.getMainGrid().setGameGridCell(i, j, Cell.DEAD);
                            break;
                        case 1:
                            ca.getMainGrid().setGameGridCell(i, j, Cell.ALIVE);
                            break;
                    }
                }

            }
        }
    }
    

    public void readFile(CellularAutomaton ca) {
        getGameType();
        setScannersInPlace();
        getDimensions();
        getGridLayout(ca);
    }
}
