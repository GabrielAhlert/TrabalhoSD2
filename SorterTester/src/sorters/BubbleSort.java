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
public class BubbleSort {
    public int[] lista;

    public BubbleSort(int[] lista) {
        this.lista = lista;
    }
    
    public results sort()  
    {  
        Calendar cal1 = Calendar.getInstance();
        int aux;
        long comp = 0, moves = 0;
        for (int i = lista.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                comp++;
                if(lista[j] > lista[j+1]){
                    moves++;
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
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