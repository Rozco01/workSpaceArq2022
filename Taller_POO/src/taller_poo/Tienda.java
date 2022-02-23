/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class Tienda {
static ArrayList<Productos> Producto = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op = 0;
        double DineroTotal = 0;
  
        do { 
            System.out.println("--------------------------------");
            System.out.println("Eliga una opcion");
            System.out.println("1) Añadir productos");
            System.out.println("2) Ver productos");
            System.out.println("3) Abastecer producto");
            System.out.println("4) Vender producto");
            System.out.println("5) Ver Total de dinero de ventas");
            System.out.println("7) Salir");
            System.out.println("--------------------------------");
            op = leer.nextInt();
            switch(op){
                case 1:
                    Productos aux = new Productos();
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombrePro = leer.next();
                    aux.setNombre(nombrePro);
                    System.out.println("Ingrese el precion unitario SIN IVA: ");
                    double precioPro = leer.nextDouble();
                    aux.setPrecio(precioPro);
                    System.out.println("Seleccione el tipo: ");
                    int op2 = 0;
                    String tipoPro;
                    
                    System.out.println("1) Papeleria");
                    System.out.println("2) Supermercado");
                    System.out.println("3) Drogueria");
                    op2 = leer.nextInt();
                    do{
                    switch(op2){
                        case 1:
                            tipoPro = "Papeleria";
                            aux.setTipo(tipoPro);
                            aux.calcularIVA(op2);
                            op2 = 326;
                        break;
                        case 2:
                            tipoPro = "Supermercado";
                            aux.setTipo(tipoPro);
                            aux.calcularIVA(op2);
                            op2 = 326;
                        break;
                        case 3:
                            tipoPro = "Drogueria";
                            aux.setTipo(tipoPro);
                            aux.calcularIVA(op2);
                            op2 = 326;
                        break;
                        default:
                            System.out.println("Error, el dato no es valido, Intente de nuevo: ");
                        break;
                    }
                    }while (op == 326);
                    System.out.println("Ingrese la cantidad de productos: ");
                    int cantidadPro = leer.nextInt();
                    aux.setCantidad(cantidadPro); 
                    Producto.add(aux);
                    
                break;
                case 2:
                    for (int i = 0; i < Producto.size(); i++) {
                        System.out.println(Producto.get(i));
                    }
                break;
                case 3:
                    String nombreAbs;
                    System.out.println("Ingrese el nombre del producto que desea Abastecer");
                    nombreAbs = leer.next();
                    for (int i = 0; i < Producto.size(); i++) {
                        if (Producto.get(i).getNombre().equalsIgnoreCase(nombreAbs)) {
                            System.out.println("Ingrese la cantidad de productos a abastecer");
                            int can = leer.nextInt();
                            Producto.get(i).ActualizarCantidad(can);
                        }
                    }
                break;
                case 4:
                    System.out.println("Ingrese el nombre del producto que desea vender");
                    nombreAbs = leer.next();
                    for (int i = 0; i < Producto.size(); i++) {
                        if (Producto.get(i).getNombre().equalsIgnoreCase(nombreAbs)) {
                            System.out.println("Ingrese la cantidad de productos a vender");
                            int can = leer.nextInt();
                            DineroTotal = Producto.get(i).getPrecioIVA() * can;
                            Producto.get(i).VenderProducto(can);
                        }
                    }
                break;
                case 5:
                    System.out.println("La cantiadad de dinero total de ventas es: " + DineroTotal);
                break;
                default:
                break;
            
            
            }
            
        } while (op != 7);
    } 
}
