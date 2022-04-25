package PrototytePractica;

import PrototytePractica.model.ProductoImpl;

public class AplicacionPractica {

	public AplicacionPractica() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Es un patron que permite la creacion de clones de un
	 * objeto, esto permite ahorrar tiempo
	 * y el objeto clonado permite que le podamos cambiar caracteristicas
	 */
	
	 public static void main(String[] args) {
	        ProductoImpl ProductoBase = new ProductoImpl();
	        ProductoBase.setNombre("Lapiz");
	        ProductoBase.setReferencia("Mongol");
	        ProductoBase.setPrecio(1000);
	        
	        
	        
	        ProductoImpl productoClonado = (ProductoImpl) ProductoBase.clonarProducto();
	        productoClonado.setReferencia("Norma");
	        productoClonado.setPrecio(1500);
	        
	        System.out.println(ProductoBase);
	        System.out.println(productoClonado);
	    }

}
