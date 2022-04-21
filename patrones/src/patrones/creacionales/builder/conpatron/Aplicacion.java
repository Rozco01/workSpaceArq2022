package patrones.creacionales.builder.conpatron;

public class Aplicacion {

	public Aplicacion(){}
	public static void main(String[] args) {
		Usuario usuario = new UsuarioBuilder()
				.email("pepito@gmail.com")
				.nombre("pepito", "perez")
				.telefono(123456).build();
	
		System.out.println("Usuario configurado con Builder: ");
		System.out.println(usuario.toString());
	}
}
