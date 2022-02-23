/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_poo;

/**
 *
 * @author Jefferson
 */
import java.util.Random;
import java.util.Scanner;


public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Definicion variables de entrada
		Scanner entrada = new Scanner (System.in);
		Random r = new Random();
		
		Persona propietarioCuenta = new Persona();
		Banco bancoCuenta = new Banco();               
                CuentaBancaria Bcuenta = new CuentaBancaria();
		
		
         int opcion = 1;
         
            System.out.println("Para validar su cuenta ingrese su edad");
            int edad2 = entrada.nextInt();
            if (propietarioCuenta.MayorEdad(edad2) == true) {
                
            
        do {
        	
        	System.out.println("==============================");
    		System.out.println("============BANCO=============");
    		System.out.println("==============================");
    		System.out.println("======1. Abrir Cuenta=========");
    		System.out.println("======2. Consignar ===========");
    		System.out.println("======3. Retirar =============");
    		System.out.println("======4. Ver Movimientos =====");

    		System.out.println("======0. Salir =====");

    		System.out.println("======Seleccion =====");

    		opcion = entrada.nextInt();
    		
    		switch (opcion) {
    		case 1: 
                    System.out.println("Datos personales");
                    System.out.println("Numero de identificacion");
                    long identificacion = entrada.nextLong();
                    propietarioCuenta.setIdentificacion(identificacion);
                    System.out.println("Nombre");
    		    String nombre = entrada.next();
    		    propietarioCuenta.setNombre(nombre);
    		    
    		    System.out.println("Apellido");
    		    String apellido = entrada.next();
    		    propietarioCuenta.setApellido(apellido);
    		    System.out.println("Edad");
    		    int edad = entrada.nextInt();
    		    propietarioCuenta.setEdad(edad);
    		    System.out.println("Genero");
    		    String genero = entrada.next();
    		    propietarioCuenta.setGenero(genero);
    		    
    		    System.out.println("Direccion");
    		    String direccion = entrada.next();
    		    propietarioCuenta.setDireccion(direccion);
    		    
    		    System.out.println("Datos Banco");
                    System.out.println("Nit del banco");
                    long nitBanco = entrada.nextLong();
                    bancoCuenta.setNitBanco(nitBanco);
    			
                    System.out.println("Nombre del banco");
                    String nombreBanco = entrada.next();
                    bancoCuenta.setNombreBanco(nombreBanco);
    			
                    System.out.println("Direccion del banco");
                    String direccionBanco = entrada.next();
                    bancoCuenta.setDireccion(direccionBanco);
    			
                    //TIPO CUENTA 
    			
                    System.out.println("Tipo de cuenta : A. Ahorros C. Corriente");
                    String tipoCuenta = entrada.next();
    			
                    //generar numero de cuenta
                    Long numeroCuenta = r.nextLong(); 
    			
                    //Crear cuenta 
    			
                    Bcuenta.AbrirCuenta(propietarioCuenta, tipoCuenta, nitBanco, bancoCuenta);
    		    break;
    		    
    		}
			
		} while (opcion != 0);
         }else{
                System.out.println("Usted es menor de edad");
            }
		
     
	  
	}
}
