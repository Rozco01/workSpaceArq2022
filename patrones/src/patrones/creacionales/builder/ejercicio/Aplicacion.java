package patrones.creacionales.builder.ejercicio;

public class Aplicacion {
	
	public Aplicacion(){}
	
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaBuilder().datos("jeffer", "12345").telefono(585654).build();
		
		System.out.println("Cuenta configurada con Builder: ");
		System.out.println(cuenta.toString());
	
	}
	
}
