/**
 * Escrbir un programa que pida al ususario una palabra por consola
 * y la muestre tres veces separada por guiones.
 * @author Cecilia Paredes
 * @version 1.0
 */
package com.ieschabas;
import java.util.Scanner;
public class Eco {
public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Se pide al usuario que introduzca una palabra
        System.out.println("Introduzca una palabra:");
        String palabra = sc.nextLine();
        //Mostramos la palabra tres veces separada por guiones
    System.out.println(palabra +"_" + palabra + "_" + palabra);
    sc.close();

    }
}
