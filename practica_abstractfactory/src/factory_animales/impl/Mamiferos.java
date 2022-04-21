package factory_animales.impl;

import factory_animales.IAnimales;

public class Mamiferos implements IAnimales{
	private String nombre;
	private Double tama�o;
	private String familia;
	
	
	public Mamiferos() {
		this.nombre=null;
		this.tama�o=null;
		this.familia=null;
	}

	@Override
	public void Identificacion() {
		System.out.println("Este animal corresponde a un mamifero");
		
	}

	@Override
	public void Resumen() {
		System.out.println("------------------------------------");
		System.out.println("-----------	 RESUMEN	------------");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Tama�o: "+this.tama�o);
		System.out.println("familia: "+this.familia);
		System.out.println("------------------------------------");
	}

	@Override
	public void Comida() {
		System.out.println("-------------------------------------");
		System.out.println("-----------	 DIETA	------------");
		System.out.println("1.): Carne, 400 gramos al dia");
		System.out.println("1.): Vegetales, 600 gramos al dia");
		System.out.println("------------------------------------");
		
	}

}
