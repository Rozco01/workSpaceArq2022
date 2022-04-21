package factory_minerales.impl;

import factory_minerales.IMinerales;

public class NoMetalicos implements IMinerales{

	private String nombre;
	private String simbolo_atomico;
	private Double Densidad;
	
	
	public NoMetalicos() {
		this.nombre=null;
		this.simbolo_atomico=null;
		this.Densidad=null;
	}

	@Override
	public void Identificacion() {
		System.out.println("Este mineral corresponde al tipo no metalico");
		
	}

	@Override
	public void Resumen() {
		System.out.println("------------------------------------");
		System.out.println("-----------	 RESUMEN	------------");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("simbolo atomico: "+this.simbolo_atomico);
		System.out.println("Densidad: "+this.Densidad);
		System.out.println("------------------------------------");
		
	}

	@Override
	public void Recomendaciones() {
		System.out.println("Los tipos de minerales no metálicos son aquellos que igualmente aparecen en la naturaleza conformando solo un elemento químico, los ejemplos más importantes son los diamantes y el grafito, ambos están químicamente compuestos tan solo por el carbono (C)");
		
	}

}
