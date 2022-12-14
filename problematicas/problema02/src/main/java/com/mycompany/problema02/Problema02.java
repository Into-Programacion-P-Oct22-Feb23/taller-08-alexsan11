/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema02;

/**
 *
 * @author aysanchez6
 */
public class Problema02 {

    public static void main(String[] args) {
       int num;
        int[] multiplicacion = {1, 2, 3, 4};

        System.out.println("N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4");
        for (num = 25; num > 0; num--) {

            System.out.println(num * multiplicacion[0] + "\t" + num
                    * multiplicacion[1] + "\t" + num * multiplicacion[2]
                    + "\t" + num * multiplicacion[3] + "\t");

        }
    }
    }

