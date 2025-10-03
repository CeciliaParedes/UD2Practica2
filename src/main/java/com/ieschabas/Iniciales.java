package com.ieschabas;

import java.util.Scanner;

/**
 * Crear un programa que pide el nombre y el primer apellido del usuario y muestre las iniciales.
 * author Cecilia Paredes
 * versión 1.0
 */
public class Iniciales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Pedimos el nombre y primer apellido
        System.out.println("Introduce tu nombre:  ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido:  ");
        String apelllido = sc.nextLine();
        //Obtenemos las iniciales, creamos los carácteres inicialNombre e inicialApellido
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apelllido.charAt(0);
        //Mostramos las iniciales separadas por puntos
        System.out.println("Iniciales:  "+ inicialNombre +"." + inicialApellido);
        sc.close();
    }
}
