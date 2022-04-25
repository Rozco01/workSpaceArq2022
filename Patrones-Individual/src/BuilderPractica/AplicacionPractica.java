package BuilderPractica;

public class AplicacionPractica {

	public AplicacionPractica() {
	}
	
	public static void main(String[] args) {
		
		/*
		 El patron builder es un tipo de diseño que 
		 se usa para crear varios tipos de objetos a partir de un objeto
		 fuente, por ejemplo lo que estamos haciendo aqui, que con un articulo
		 fuente creamos varios y de ellos podemos hacer comprobaciones
		 pidiendo cierto tipos de atributos.
		 */
		
		//1 Comprobacion
		UsuarioPractica usuario = new UsuarioPracticaBuilder().id(15456).build();
		System.out.println("Usuario configurado con Builder: ");
		System.out.println(usuario.toString());
		
		//2 Comprobacion
		UsuarioPractica usuario2 = new UsuarioPracticaBuilder().id2(15436,"Hola123").build();
		System.out.println("Usuario2 configurado con Builder: ");
		System.out.println(usuario2.toString());
		
		//3 Comprobacion
		UsuarioPractica usuario3 = new UsuarioPracticaBuilder().id3(11536,"Hola123","Borrador").build();
		System.out.println("Usuario3 configurado con Builder: ");
		System.out.println(usuario3.toString());
		
		//4 Comprobacion
		UsuarioPractica usuario4 = new UsuarioPracticaBuilder().id4(13546,10000, 50000).build();
		System.out.println("Usuario4 configurado con Builder: ");
		System.out.println(usuario4.toString());
	
		//5 Comprobacion
		UsuarioPractica usuario5 = new UsuarioPracticaBuilder().id5(13785 , "Algo que sirve para borrar", 2).build();
		System.out.println("Usuario5 configurado con Builder: ");
		System.out.println(usuario5.toString());
	
	}

}
