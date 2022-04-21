package factory_plantas.impl;

import factory_plantas.IPlantas;

public class Matas implements IPlantas{
	private String nombre;
	private Double tama�o;
	private String familia;
	
	
	public Matas() {
		this.nombre=null;
		this.tama�o=null;
		this.familia=null;
	}

	@Override
	public void Identificacion() {
		// TODO Auto-generated method stub
		System.out.println("Esta en la fabrica plantas en la clase Matas");
	}

	@Override
	public void Resumen() {
		// TODO Auto-generated method stub
		System.out.println("Nombre:" + this.nombre + "\n Tama�o: " +this.tama�o + "\n Familia: " +this.familia);
	}

	@Override
	public void Cuidado() {
		// TODO Auto-generated method stub
		System.out.println("Las matas necesitan de una buena hidratacion y luz solar");
	}

}

