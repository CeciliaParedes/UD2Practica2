package com.ieschabas;

import java.util.Scanner;

/**
 * Crear un programa que lea un precio en euros con céntimos y muestre por separados euros y céntimos.
 * @author Cecilia Paredes
 * versión 1.0
 */
public class Precios {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Pedimos el precio
        System.out.println("Ingrese el precio en euros (ej. 12.34):");
        double precio = sc.nextDouble();
         //Parte entera (euros)
        int euros = (int) precio;
        //Parte decimal
        int centimos= (int) Math.round((precio - euros) * 100);
        //Mostramos el resultado
        System.out.println("Euros:  "+ euros);
        System.out.println("Céntimos: " + centimos);
        sc.close();
    }
}
