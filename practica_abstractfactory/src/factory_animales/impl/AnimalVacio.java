package factory_animales.impl;

import factory_animales.IAnimales;

public class AnimalVacio implements IAnimales{

	public AnimalVacio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Identificacion() {
		System.out.println("Esta es una instancia vacia");
		
	}

	@Override
	public void Resumen() {
		// TODO Auto-generated method stub
		System.out.println("Esta es una instancia vacia");
	}

	@Override
	public void Comida() {
		// TODO Auto-generated method stub
		System.out.println("Esta es una instancia vacia");
	}

}
