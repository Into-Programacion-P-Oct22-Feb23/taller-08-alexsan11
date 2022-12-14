/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author aysanchez6
 */
public class Problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicionCampo;
        int edad;
        double estatura;
        String acumulador = "";
        String serie = "";
        double sumaedad = 0;
        double sumaestatura = 0;
        double promedioedad;
        double promedioestatura;
        int numero = 1;
        for (int contador = 1; contador <= 5; contador++) {

            System.out.println("ingrese nombre porfavor");
            nombre = entrada.nextLine();
            System.out.println("ingrese la posicione en la que juega");
            posicionCampo = entrada.nextLine();
            System.out.println("ingrese su edad");
            edad = entrada.nextInt();
            System.out.println("ingrese la estatura");
            estatura = entrada.nextDouble();

            entrada.nextLine();

            acumulador = String.format("%s%d.%s-%s-,edad %d,estatura %.2f\n",
                    acumulador,
                    numero,
                    nombre,
                    posicionCampo,
                    edad,
                    estatura);
            serie = String.format("%s %d", serie, edad);

            sumaedad = sumaedad + edad;
            sumaestatura = sumaestatura + estatura;
            numero = numero + 1;
        }
        promedioedad = sumaedad / 5;
        promedioestatura = sumaestatura / 5;

        System.out.printf(acumulador);
        System.out.printf("listados de edades%s", serie);
        System.out.printf(" Promedio de edades:%.1f", promedioedad);
        System.out.printf(" Promedio de estatura: %.2f ", 
                promedioestatura);

    }
}
