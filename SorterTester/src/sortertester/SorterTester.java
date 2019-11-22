/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortertester;

import sorters.SelectionSort;

/**
 *
 * @author Administrador
 */
public class SorterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort(reader.Reader.readAle(100000));
        System.out.println(s.sort());
    }
    
}
