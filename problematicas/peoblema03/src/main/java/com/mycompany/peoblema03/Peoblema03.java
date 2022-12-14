/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peoblema03;

/**
 *
 * @author aysanchez6
 */
public class Peoblema03 {

    public static void main(String[] args) {
        
        String cadena = "";
       double grado;
        double formula;
        double numerador = 5;
        double denominador = 9;
        

        for (grado = 20; grado < 84; grado += 4) {
            formula = (numerador / denominador) * (grado - 32);
            cadena = String.format("%s %.0f °F = %.2f °C\n",
                    cadena,
                    grado,
                    formula);

        }
        System.out.println(cadena);

    }
}
        
    

