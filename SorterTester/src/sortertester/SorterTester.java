/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortertester;

import sorters.BubbleSort;
import sorters.InsertionSort;
import sorters.QuickSort;
import sorters.SelectionSort;
import sorters.ShellSort;

/**
 *
 * @author Administrador
 */
public class SorterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SelectionSort a = new SelectionSort(reader.Reader.readAle(100000));
        System.out.println(a.sort());
        
        InsertionSort s = new InsertionSort(reader.Reader.readAle(100000));
        System.out.println(s.sort());
        
        BubbleSort b = new BubbleSort(reader.Reader.readAle(100000));
        System.out.println(b.sort());
        //b.print();
        
        ShellSort sh = new ShellSort(reader.Reader.readAle(1000000));
        System.out.println(sh.sort());
        //sh.print();
        
        QuickSort q = new QuickSort(reader.Reader.readAle(1000000));
        System.out.println(q.sort());
        //q.print();
        
       
    }
    
}
