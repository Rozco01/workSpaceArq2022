package PrototytePractica.model;

import PrototytePractica.IProducto;

public class ProductoImpl implements IProducto{

	private String tipo;
	private String nombre;
	private String referencia;
	private double precio;
	
	public ProductoImpl() {
		tipo = "Escolares";
	}
	
	public IProducto clonarProducto() {
		ProductoImpl producto = null;
		
		try {
			producto = (ProductoImpl) clone();
		}catch(CloneNotSupportedException cex) {
			cex.getStackTrace();
		}
		return producto;
	}
	
	@Override
	public String toString() {
		return "Producto Impl [tipo = " + tipo+ ", nombre= " +nombre+ ", referencia= " +referencia+ ", precio" +precio+"]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
