package com.ieschabas;

import java.util.Scanner;

/**
 * Crear un programa que pida al usuario el día, mes y año y muestra la fecha en formato YYYY-MM-DD
 * @author Cecilia Paredes
 * versión 1.0
 */
public class FormatoFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos el día, mes y año
        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        //Mosttramos la fecha en formato YYYY-MM-DD
        System.out.printf("Fecha : %04d-%02d-%02d", anio, mes, dia);
        sc.close();
    }

}
