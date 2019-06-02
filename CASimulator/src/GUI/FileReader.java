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
    
    private final String fileName;
    private final File file;
    private static Scanner sc;
    private static Scanner scColumns;
    private static Scanner scRows;
    private static int columnsNumber;
    private static int rowsNumber;
    private static String row;
    private final String automat = "Automat: ";
    private final String grid = "Grid:";
    
    public FileReader( String name) throws FileNotFoundException {
        fileName = name; //NAZWA PLIKU Z GUIa
        this.file = new File(fileName);
        FileReader.sc = new Scanner(file);
        FileReader.scColumns = new Scanner(file);
        FileReader.scRows = new Scanner(file);
    }
    
    public void getGameType() throws NoSuchElementException {
        sc.skip(automat);
        System.out.println(sc.nextLine());
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
        while( !(scRows.hasNext("/grid")) ){
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
        for(int i = 0; i < rowsNumber; i++){
            for(int j = 0; j < columnsNumber; j++){
                switch(sc.nextInt()){
                    case 0:
                        ca.setCellFromGrid(i, j, Cell.EMPTY);
                        break;
                    case 1:
                        ca.setCellFromGrid(i, j, Cell.WIRE);
                        break;
                    case 2:
                        ca.setCellFromGrid(i, j, Cell.EHEAD);
                        break;
                    case 3:
                        ca.setCellFromGrid(i, j, Cell.ETAIL);
                        break;
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
