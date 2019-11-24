/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import java.util.Calendar;
import models.results;

/**
 *
 * @author gabri
 */
public class ShellSort {
    int[] lista;

    public ShellSort(int[] l) {
        this.lista = l;
    }
    
    public results sort(){
        Calendar cal1 = Calendar.getInstance();
	int i, j, value, gap = 1; 
        long comp = 0, moves = 0;
        
        comp++;
        while(gap<lista.length){
            comp++;
            gap = 3*gap+1;
        }
        comp++;
        while(gap > 1){
            comp++;
            gap /= 3;
            for (i = gap; i < lista.length; i++) {
                value = lista[i];
                j = i - gap;
                comp++;
                while(j>=0 && value < lista[j]){
                    comp++;
                    moves++;
                    lista[j + gap] = lista[j];
                    j -= gap;
                }
                moves++;
                lista[j+gap] = value;
            }
        }
        
        Calendar cal2 = Calendar.getInstance();
        
        return new results(cal2.getTimeInMillis()-cal1.getTimeInMillis(), comp, moves) ;
    }


    public void print() {
        for (int i = 0; i <lista.length; i++) {
           System.out.println(lista[i]); 
        }
    }
    
}
