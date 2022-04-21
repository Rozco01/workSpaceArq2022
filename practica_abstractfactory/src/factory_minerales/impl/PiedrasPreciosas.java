package factory_minerales.impl;

import factory_minerales.IMinerales;

public class PiedrasPreciosas implements IMinerales{

	private String nombre;
	private String simbolo_atomico;
	private Double Densidad;
	
	
	public PiedrasPreciosas() {
		this.nombre=null;
		this.simbolo_atomico=null;
		this.Densidad=null;
	}

	@Override
	public void Identificacion() {
		System.out.println("Este mineral corresponde al tipo de piedras preciosas");
		
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
		System.out.println("Las piedras preciosas son aquellos minerales que se usan en la industria de la joyer�a y se comercializan como gemas que var�an en sus precios de acuerdo con el tipo de piedra preciosa. Aqu� se destacan los diamantes como los minerales usados como piedras preciosas m�s valiosos del mercado.");
		
	}

}
