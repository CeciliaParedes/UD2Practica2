package com.ieschabas;

import java.util.Scanner;

/**
 * Creamos una clase Temperatura
 * @author Cecilia Paredes
 * @versión 1.0
 */
public class Temperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos la temperatura en Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        //Convertimos a Fahrenheit y Kelvin
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        //Mostramos los resultados en consola con dos decimales
        System.out.printf("Equivalente en Fahrenheit : %2.fºF\n", fahrenheit);
        System.out.printf("Equivalente en Kelvin: %.2f k\n", kelvin);
        sc.close();

    }
}
