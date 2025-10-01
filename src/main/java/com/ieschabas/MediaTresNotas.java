package com.ieschabas;

import java.util.Scanner;

/**
 * Se crea una clase MediaTres Notas
 * @author ceciliaParedes
 * @versión 1.0
 */
public class MediaTresNotas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Pedimos las tres notas al ususario
        System.out.println("Introduce la primera nota : ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        double nota3 = sc.nextDouble();

        //Calculamos la media de las tres notas
        double media = (nota1 + nota2 + nota3)/3;

        //Mostramos la media con dos decimales
        System.out.printf("la media es: %.2f\n", media);



    }
}
