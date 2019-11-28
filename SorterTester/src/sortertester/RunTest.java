/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortertester;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.SortResult;
import sorters.BubbleSort;
import sorters.InsertionSort;
import sorters.QuickSort;
import sorters.SelectionSort;
import sorters.ShellSort;
import sorters.Sort;
import view.Screen;


/**
 *
 * @author Windows
 */
public class RunTest implements Runnable{
    int slider, radio, combo1,combo2;
    Screen frame;

    public RunTest(int slider, int radio, int combo1, int combo2, Screen frame) {
        this.slider = slider;
        this.radio = radio;
        this.combo1 = combo1;
        this.combo2 = combo2;
        this.frame = frame;
    }
    
    
    
    
    @Override
    public void run() {
        Sort a = null, b = null;
        int i = 1000 ;
        int [] a_ = null;
        int [] b_ = null;
        
        
        
        switch(slider){
            case 0:
                i = 1000;
            break;
            case 1:
                i = 10000;
            break;
            case 2:
                i = 100000;
            break;
            case 3:
                i = 1000000;
            break;
        }
        
        if (radio == 0){
            a_ = reader.Reader.readOrd(i);
            b_ = reader.Reader.readOrd(i);
        }
        
        if (radio == 1){
            a_ = reader.Reader.readAle(i);
            b_ = reader.Reader.readAle(i);
        }
        
        if (radio == 2){
            a_ = reader.Reader.readDec(i);
            b_ = reader.Reader.readDec(i);
        }
            
        
        
        
        switch(combo1){
            case 0:
                a = new SelectionSort(a_);
            break;
            case 1:
                a = new InsertionSort(a_);
            break;
            case 2:
                a = new BubbleSort(a_);
            break;
            case 3:
                a = new ShellSort(a_);
            break;
            case 4:
                a = new QuickSort(a_);
            break;
        }
        
        switch(combo2){
            case 0:
                b = new SelectionSort(b_);
            break;
            case 1:
                b = new InsertionSort(b_);
            break;
            case 2:
                b = new BubbleSort(b_);
            break;
            case 3:
                b = new ShellSort(b_);
            break;
            case 4:
                b = new QuickSort(b_);
            break;
        }
        
        SortResult  aR= a.sort();
        SortResult  bR= b.sort();
        
        frame.stopPro();
        
        JOptionPane.showMessageDialog(null, Compare.comparar(aR, bR));
        
    }
    
}
