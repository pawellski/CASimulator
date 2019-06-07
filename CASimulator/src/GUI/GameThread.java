/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.CellularAutomaton;
import Core.GameOfLife;

/**
 *
 * @author Paweł
 */
public class GameThread extends Thread {

    private boolean flag = true;
    private CellularAutomaton threadAutomaton;
    private int countGenerations;
    private int intervalTime;

    public GameThread(CellularAutomaton game, int generations, int interval) {
        this.threadAutomaton = game;
        this.countGenerations = generations;
        this.intervalTime = interval;
    }

    @Override
    public void run() {
        int iterations = 0;
        while (flag && threadAutomaton.isGridChanging() && iterations < countGenerations) {
            threadAutomaton.generate();
            try {
                Thread.sleep(intervalTime);
            } catch (InterruptedException ex) {

            }
            iterations++;
        }
    }
    
   

    @Override
    public void interrupt() {
        flag = false;
    }

    
}
