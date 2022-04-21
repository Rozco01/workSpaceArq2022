package patrones.creacionales.builder.ejercicio;

import patrones.creacionales.builder.conpatron.UsuarioBuilder;

public class Cuenta {
	
	//Datos necesarios
	private String nombre;
	private String cedula;
	
	//Datos inecesarios
	private String trabajo;
	private int edad;
	private long telefono;
	private String direccion;
	
	public Cuenta() {
		
	}
	
	public Cuenta (CuentaBuilder builder) {
		if (builder.getNombre() == null && builder.getCedula() == null ) {
			throw new IllegalArgumentException("Nombre y cedula son requeridos");
		}
		
		this.nombre = builder.getNombre();
		this.cedula = builder.getCedula();
		this.trabajo = builder.getTrabajo();
		this.edad = builder.getEdad();
		this.telefono = builder.getTelefono();
		this.direccion = builder.getDireccion();
		}
	
	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return " nombre: " + nombre +  " cedula: " + cedula + " telefono: " + telefono;
    }
}
