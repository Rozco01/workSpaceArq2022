package factory_plantas.impl;

import factory_plantas.IPlantas;

public class PlantasVacio implements IPlantas{

	public PlantasVacio() {
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
	public void Cuidado() {
		// TODO Auto-generated method stub
		System.out.println("Esta es una instancia vacia");
	}

}
