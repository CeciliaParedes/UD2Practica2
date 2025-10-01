package com.ieschabas;

import java.util.Scanner;

/**
 * Se crea la clase Rectangulo
 * @author Cecilia Paredes
 * @version 1.0
 */
public class Rectangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos la base y la altura
        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        //Calulamos el área y el perímetro del rectángulo
        double area = base + altura;
        double perimetro = 2 * (base + altura);

        //Mostramos los resultados en consola
        System.out.printf("Área: %.2f\n" , area);
        System.out.printf("Perímetro: %.2f\n" , perimetro);
        sc.close();

    }
}
