package factory_plantas.impl;

import factory_plantas.IPlantas;

public class Arboles implements IPlantas{
	private String nombre;
	private Double tama�o;
	private String familia;
	
	
	public Arboles() {
		this.nombre=null;
		this.tama�o=null;
		this.familia=null;
	}
	@Override
	public void Identificacion() {
		// TODO Auto-generated method stub
		System.out.println("Esta en la fabrica plantas en la clase Arboles");
	}

	@Override
	public void Resumen() {
		// TODO Auto-generated method stub
		System.out.println("Nombre:" + this.nombre + "\n Tama�o: " +this.tama�o + "\n Familia: " +this.familia);
	}

	@Override
	public void Cuidado() {
		// TODO Auto-generated method stub
		System.out.println("Recuerde siempre mantener hidratado el arbol");
	}

}
