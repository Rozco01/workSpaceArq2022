package factory_plantas.impl;

import factory_plantas.IPlantas;

public class Hierbas implements IPlantas{
	private String nombre;
	private Double tamaño;
	private String familia;
	
	
	public Hierbas() {
		this.nombre=null;
		this.tamaño=null;
		this.familia=null;
	}

	@Override
	public void Identificacion() {
		// TODO Auto-generated method stub
		System.out.println("Esta en la fabrica plantas en la clase Hierbas");
	}

	@Override
	public void Resumen() {
		// TODO Auto-generated method stub
		System.out.println("Nombre:" + this.nombre + "\n Tamaño: " +this.tamaño + "\n Familia: " +this.familia);
	}

	@Override
	public void Cuidado() {
		// TODO Auto-generated method stub
		System.out.println("Las hierbas necesitan de una buena iluminacion solar");
	}

}
