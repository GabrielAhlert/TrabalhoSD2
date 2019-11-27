/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import java.util.Calendar;
import models.R;

/**
 *
 * @author gabri
 */
public class QuickSort extends Sort{
        int[] lista;
        long moves;
        long comp;
        
    public QuickSort(int[] l) {
        this.lista = l;
        
    }
    
        @Override
    public R sort(){
        Calendar cal1 = Calendar.getInstance();
	quickSort(0, lista.length-1);
        Calendar cal2 = Calendar.getInstance();
        
        return new R(cal2.getTimeInMillis()-cal1.getTimeInMillis(), comp, moves) ;
    }
    
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = this.lista[lowerIndex + (higherIndex - lowerIndex) / 2];
        comp++;
        while (i <= j) {
            comp++;
            while (this.lista[i] < pivot) {
                i++;
                comp++;
            }
            comp++;
            while (this.lista[j] > pivot) {
                comp++;
                j--;
            }
            comp++;
            if (i <= j) {
                int temp = this.lista[i];
                this.lista[i] = lista[j];
                this.lista[j] = temp;
                i++;
                j--;
                moves++;
            }
        }

    }


        @Override
    public void print() {
        for (int i = 0; i <lista.length; i++) {
           System.out.println(lista[i]); 
        }
    }
}
