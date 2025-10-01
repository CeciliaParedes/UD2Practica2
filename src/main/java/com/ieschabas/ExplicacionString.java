package com.ieschabas;
import java.util.Scanner;
/*public class ExplicacionString {
    public static void main(String[] args){
        System.out.println("Introduce palabra:");
        String palabra = lector.nextLine();
                System.out.println("Número de cracrteres: "+ palabra.length());

                //Conversión a mayúsculas y minúsculas
        System.out.println("Introduce código de producto: ");
        String codigo = lector.nextLine().toUpperCase();
        System.out.println("El código de producto es: " + codigo);
        //LLF 23TK LOP -> LLF
        char target;
        String codigoConGuiones = codigo.replace (target + "." + replacement + ".");
        System.out.println("El nuevo codigo es:"+ codigoConGuiones);
        //Comprobación de @ en el email
        System.out.println("Introduce el email: ");
        String email = lector.nextLine();
        if(email.contains("@")) {
            System.out.println("Email introducido correctamente");
        }else{
            System.out.println("Errror al introducir el email");
        }
       //Mostrar iniciales de la persona
       System.out.println("Introduce el nombre: ");
        String nombre= lector.nextLine();
        System.out.println("Introduce el apellido: ");
        String apellido = lector.nextLine();

        //Cecilia Paredes -> V.T.
        String nombreSinEspacios = nombre.trim();
        String apellidoSinEspacios = apellido.trim();
        String incialNombre = nombreSinEspacios.substring(0,1);
        String inicialApellido = apellidoSinespacios.substring(0,1);
        System.out.println("Bienvenido " + inicialNombre + "."+ inicialApellido +".");

        //Iniciales son charAt
        char inicialNombre2 = nombreSinEspacios.charAt(0);
        char inicialApellido2 = apellidoSinEspacios.charAt (0);
        System.out.println("Bienvenido " + inicialNombre2 + "." + inicialApelllido2 + ".");

        //Paseo de la datos con slit
        //Ide;nombre;cantidad;precio
        String Lineaproducto ="1;tomates;50;2";
        String[] productos = lineaProducto.split(regex: ";");
        Producto producto = new Producto();
        producto.setId(Long.parseLong(productos[0]));
        producto.setNombre(productos[1]);
        producto.setCantidad(Integer.parseInt(productos[2]));
        producto.setPrecio(Integer.parseIn(productos[3]));

        System.out.println(producto.toString());



    }
}
