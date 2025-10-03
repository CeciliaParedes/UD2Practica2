package com.ieschabas;

import java.util.Scanner;

/** Se crea una clase SumaFormateada para un programa
 * de una suma con formato a  b = resultado
 * @author Cecilia paredes
 * @version 1.0
 */
public class SumaFormateada {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Pedimos ingregar el primer número
        System.out.println( "Introduce el primer número: ");
        int num1 = sc.nextInt();

        //Pedimos ingresar el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        //Calculamos la suma
        int suma = num1 + num2;

        //Mostramos la suma en formato a + b = resultado
        System.out.println(num1 + "+" + num2 + "=" + suma);
        sc.close();

    }
}


