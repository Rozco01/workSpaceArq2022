package factory_minerales.impl;

import factory_minerales.IMinerales;

public class MineralVacio implements IMinerales{

	public MineralVacio() {
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
	public void Recomendaciones() {
		// TODO Auto-generated method stub
		System.out.println("Esta es una instancia vacia");
	}
}
