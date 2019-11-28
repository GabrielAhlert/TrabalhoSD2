/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortertester;

import java.util.concurrent.TimeUnit;
import static javafx.util.Duration.millis;
import models.SortResult;

/**
 *
 * @author Windows
 */
public class Compare {
    public static String timetosec(long ms){
        if(ms>1000){
            double temp = ms/1000.0;
            return String.valueOf(temp) + " sec";
        }
        else
            return ms + " ms";
    }
    
    public static String comparar(SortResult a, SortResult b){
        if(a.time<b.time){
            return "Resultados:\n O " + a.nome + " foi mais rápido que o " + b.nome + " por " + timetosec(b.time-a.time)+"\n"+ a.toString()+"\n"+b.toString();
        }else{
            return "Resultados:\n O " + b.nome + " foi mais rápido que o " + a.nome + " por " + timetosec(a.time-b.time)+"\n"+ a.toString()+"\n"+b.toString();
        }
    }
}
