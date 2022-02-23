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
public class Persona {
    	//atributos de la classe 
	private long identificacion;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String direccion;
	
	
	//constructor principal de la clase
	public Persona() {
		
		
		
	}

	//encapsulamiento
	public final long getIdentificacion() {
		return identificacion;
	}


	public final void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}


	public final String getNombre() {
		return nombre;
	}


	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public final String getApellido() {
		return apellido;
	}


	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public final int getEdad() {
		return edad;
	}


	public final void setEdad(int edad) {
		this.edad = edad;
	}


	public final String getGenero() {
		return genero;
	}


	public final void setGenero(String genero) {
		this.genero = genero;
	}


	public final String getDireccion() {
		return direccion;
	}


	public final void setDireccion(String direccion) {
		this.direccion = direccion;
	}
        
        public boolean MayorEdad(int edad){
        boolean mayor;
            if (edad >= 18) {
                mayor = true;
            } else {
                mayor = false;
            }
        return mayor;
        }
}
