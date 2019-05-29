/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grid;

/**
 *
 * @author Paweł
 */
public class Grid {

    private int width;
    private int height;
    public Cell[][] gameGrid;

    public Grid(){
        
    }
    
    public Grid(int hei, int wi) {
        height = hei;
        width = wi;
        gameGrid = new Cell[height][width];
    }

    public void resize(int hei, int wi) {
        height = hei;
        width = wi;
        gameGrid = new Cell[height][width];
    }

}
