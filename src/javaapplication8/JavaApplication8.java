/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Okabe
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String _1 = "A";
//        String _2= "d";
//        int res = _1.compareToIgnoreCase(_2);
//        int absRes=Math.abs(res);
//        System.out.println(absRes);
        String[] hola = new String[5];
        int[] ho = new int[5];
        hola[0] = "0";
        hola[1] = "1";
        hola[2] = "2";
        int i = cantidadOcupada(hola);
        
        System.out.println(i);
       
    }

    public static int cantidadOcupada(String[] vec) {
        int cantidad = 0;
        for (String vec1 : vec) {
            if (vec1 == null) {
                break;
            }
            cantidad++;
        }
        return cantidad;
    }

    public static String imprimir(String[] vec) {
        String c = "";
        for (String v : vec) {
            c = c + v + " - ";
        }
        return c;
    }

    public static String imprimir(String[] vec, int cantidad) {
        String c = "";
        for (int i = 0; i < cantidad; i++) {
            c = c + vec[i] + " - ";
        }
        return c;
    }

}
