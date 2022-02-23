/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_poo;

/**
 *
 * @author Jefferson
 */
public class Productos {
    
    String nombre;
    String tipo;
    int cantidad;
    double precio;
    double precioIVA;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }
    
    

    public Productos() {
    }

    public Productos(String nombre, String tipo, int cantidad, double precio, double precioIVA) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precioIVA = precioIVA;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------------------------");
        sb.append("\nNombre: "+ getNombre());
        sb.append("\nTipo: "+ getTipo());
        sb.append("\nCantidad: " + getCantidad());
        sb.append("\nPrecio: "+ getPrecio());
        sb.append("\nPrecio IVA: "+ getPrecioIVA());
        sb.append("\n------------------------------------");
        return sb.toString();
    }
    
    public void calcularIVA(int a){
        if (a == 1) {
            setPrecioIVA((getPrecio()*0.16)+getPrecio());
            System.out.println("Precio IVA: "+ getPrecioIVA());
        }else if(a == 2){
            setPrecioIVA((getPrecio()*0.04)+getPrecio());
            System.out.println("Precio IVA: "+ getPrecioIVA());
        }else if(a == 3){
            setPrecioIVA((getPrecio()*0.12)+getPrecio());
            System.out.println("Precio IVA: "+ getPrecioIVA());
        }
    }
     
    public void ActualizarCantidad(int can){
        System.out.println("Cantidad del producto antes: " +getCantidad());
        setCantidad(getCantidad()+can);
        System.out.println("Cantidad del producto ahora: "  + getCantidad());
    }
    
    public void VenderProducto(int can){
        if (getCantidad()< can) {
            System.out.println("Ingreso un numero mayor a la cantidad de productos");
            System.out.println("Disponibles");
        }else{ 
            System.out.println("Cantidad del producto antes: " +getCantidad());
            setCantidad(getCantidad()-can);
            System.out.println("Cantidad del producto ahora: "  + getCantidad());
        }
       
    }
}
