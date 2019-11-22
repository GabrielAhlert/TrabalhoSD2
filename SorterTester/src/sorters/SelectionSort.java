/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import java.util.ArrayList;
import java.util.Calendar;
import models.results;

/**
 *
 * @author Administrador
 */
public class SelectionSort {
    int[] lista;

    public SelectionSort(int[] l) {
        this.lista = l;
    }
    
    public results sort(){
        Calendar cal1 = Calendar.getInstance();
	int i, j; 
        long comp = 0, moves = 0;
	int min, temp;

	for (i = 0; i < lista.length-1; i++)
	{
	    min = i;
	    for (j = i+1; j < lista.length; j++)
	    {
                comp ++;
	    if (lista[j] < lista[min])
                min = j;
	    }
            moves++;
	    temp = lista[i];
	    lista[i] = lista[min];
	    lista[min] = temp;
	}
        Calendar cal2 = Calendar.getInstance();
        
        return new results(cal2.getTimeInMillis()-cal1.getTimeInMillis(), comp, moves) ;
    }  
    
}