/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Administrador
 */
public class results {
    public long time;
    public long comparations;
    public long moves;

    public results(long time, long comparations, long moves) {
        this.time = time;
        this.comparations = comparations;
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "results{" + "time=" + time + "ms, comparations=" + comparations + ", moves=" + moves + '}';
    }
    
    
}
