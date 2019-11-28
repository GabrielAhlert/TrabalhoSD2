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
public class SortResult {
    public long time;
    public long comparations;
    public long moves;
    public String nome;

    public SortResult(long time, long comparations, long moves, String n) {
        this.time = time;
        this.comparations = comparations;
        this.moves = moves;
        this.nome = n;
    }

    @Override
    public String toString() {
        return nome + ": " + "Tempo= " + time + "ms, Comparações= " + comparations + ", movimentos= " + moves;
    }
    

    
    
}
