package com.ieschabas;

import java.util.Scanner;

/**
 * Creamos una clase Cilindro con atributos radio y altura
 * @author Cecilia paredes
 * @versión0.1
 */
public class Cilindro {
    //Atributos privados
    private double radio;
    private double altura;

    //Constructor
    public Cilindro(double radio, double altura) {
        if (radio < 0 || altura < 0){

            throw new IllegalArgumentException("Radio y altura deben ser mayores o iguales a 0");
        }
        this.radio = radio;
        this.altura = altura;
    }

    //Método para calcular el volumen
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    //Método main para pedir los datos y mostrar el resultado en consola
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();
         //Creamos el objeto cilindro
        Cilindro cilindro = new Cilindro(radio, altura);
        //Mostramos el volumen
        System.out.printf("El volumen del cilindro es: %.2f\n",cilindro.calcularVolumen());
        sc.close();


    }


}
