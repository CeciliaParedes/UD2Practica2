package com.ieschabas;

public class Producto {

    private long id;
    private String nombre;
    private int cantidad;
    private int precio;

    public Producto(){}
    public Producto(long id, String nombre, int cantidad, int precio){
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        public void setNombre(String nombre){
            this.nombre = nombre
        }
        public String toString(){
            return "Id: " + this.id + "Nombre: " +this.nombre + "Cantidad: " + this.cantidad + "Precio : " + this.precio
        }

    }
}
