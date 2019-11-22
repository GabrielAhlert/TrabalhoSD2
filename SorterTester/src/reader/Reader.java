/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Reader {
    public static ArrayList<Integer> read(String caminho,int n){
        ArrayList <Integer> lista = new ArrayList<>();
        String row;
        try{
            int i = 0;
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            reader.readLine();
            while((row = reader.readLine())!=null && i<n){
                lista.add(Integer.valueOf(row));
                i++;
            }
                
        }catch(IOException | NumberFormatException ex){
            System.out.println(ex); 
        }
        return lista;
    }
    
    public static int[] readAle(int n){
        return read("src\\numeros_aleatorios.txt",n).stream().mapToInt(i -> i).toArray();
    }
    public static int[] readOrd(int n){
        return read("src\\numeros_ordenados.txt",n).stream().mapToInt(i -> i).toArray();
    }
    public static int[] readDec(int n){
        return read("src\\numeros_ordem_decrescente.txt",n).stream().mapToInt(i -> i).toArray();
    }
    
}
