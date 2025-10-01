package com.ieschabas;

import java.util.Scanner;

/**
 * Creamos la clase DosCanciones
 * @author Cecilia Paredes
 * @versión 1.0
 */
public class DosCanciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Primera canción
        System.out.print("Introduce los minutos de la primera canción: ");
        int min1 = sc.nextInt();
        System.out.print("Introduce los segundos de la primera canción; ");
        int seg1 = sc.nextInt();

        //Segunda canción
        System.out.print("Introduce los minutos de la segunda canción: ");
        int min2 = sc.nextInt();
        System.out.print("Introduce los segundos de la segunda canción: ");
        int seg2 = sc.nextInt();

        //Convertimos todo a segundos  y sumanos
        int totalSegundos =(min1 * 60 + seg1) + (min2 * 60 + seg2);
         //Convertimos de nuevo a minutos y segundos
        int totalMinuntos = totalSegundos / 60;
        int segundosRestantes = totalSegundos % 60;
         //Mostramos el resultado en formato mm:ss
        System.out.printf("Duración total: %02d:%02d\n", totalSegundos,segundosRestantes);
        sc.close();

    }
}
