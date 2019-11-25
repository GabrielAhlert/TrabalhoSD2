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
    
    private void quickSort(int inicio, int fim){
        this.comp++;
        if(inicio < fim){
                int pivot = partition(inicio,fim);
                quickSort(inicio, pivot);
                quickSort(pivot+1,fim);
        }
        
    }
    
    private int partition(int inicio,int fim){
        
        int x,i,j,aux;
        x =lista[inicio];
        i=inicio-1;
        j=fim+1;
        
        while (true){
            do{ j--; } while (lista[j] > x);
            do{ i++; } while (lista[i] < x);
            
            this.comp++;
            if( i < j){
                this.moves++;
                aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
            }else{
                return j;
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
