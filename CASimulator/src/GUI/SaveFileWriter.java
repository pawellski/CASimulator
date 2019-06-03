/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.FileWriter;
import java.io.PrintWriter;
import Core.CellularAutomaton;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kuba
 */
public class SaveFileWriter {
    
    private String gameType;
    private File file;
    private FileWriter fw;
    private PrintWriter pw;

    public SaveFileWriter(String fileName) throws IOException {
        file = new File(fileName);
        this.fw = new FileWriter(file, false);
        this.pw = new PrintWriter(fw);
    }

    
    private void getGameType(CellularAutomaton ca) {
        gameType = ca.getClass().getName();
    }
    
    private void writeGameType() {
        if("Core.WireWorld".equals(gameType)){
            pw.println("Automat: WireWorld");
        } else {
            pw.println("Automat: GameOfLife");
        }
    }
    
    private void writeGrid(CellularAutomaton ca){
        pw.println("Grid:");
       
    }
    
    private void writeFile(CellularAutomaton ca) {
        writeGameType();
    }
}
