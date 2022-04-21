package factory_animales.impl;

import factory_animales.IAnimales;

public class Aves implements IAnimales{
	private String nombre;
	private Double tamaño;
	private String familia;
	
	
	public Aves() {
		this.nombre=null;
		this.tamaño=null;
		this.familia=null;
	}

	@Override
	public void Identificacion() {
		System.out.println("Este animal corresponde a un ave");
		
	}

	@Override
	public void Resumen() {
		System.out.println("------------------------------------");
		System.out.println("-----------	 RESUMEN	------------");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Tamaño: "+this.tamaño);
		System.out.println("familia: "+this.familia);
		System.out.println("------------------------------------");
	}

	@Override
	public void Comida() {
		System.out.println("-------------------------------------");
		System.out.println("-----------	 DIETA	------------");
		System.out.println("1.): Insectos, 300 gramos al dia");
		System.out.println("------------------------------------");
	}

}
