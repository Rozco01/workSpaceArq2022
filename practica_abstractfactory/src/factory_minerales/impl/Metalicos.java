package factory_minerales.impl;

import factory_minerales.IMinerales;

public class Metalicos implements IMinerales{
	private String nombre;
	private String simbolo_atomico;
	private Double Densidad;
	
	
	public Metalicos() {
		this.nombre=null;
		this.simbolo_atomico=null;
		this.Densidad=null;
	}

	@Override
	public void Identificacion() {
		System.out.println("Este mineral corresponde al tipo metalico");
		
	}

	@Override
	public void Resumen() {
		System.out.println("------------------------------------");
		System.out.println("-----------	 RESUMEN	------------");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("simbolo atomico: "+this.simbolo_atomico);
		System.out.println("Densidad: "+this.Densidad);
		System.out.println("------------------------------------");
		
	}

	@Override
	public void Recomendaciones() {
		System.out.println("Los minerales met�licos se caracterizan por ser excelentes conductores de la electricidad, conductores t�rmicos, por tener un brillo met�lico y porque generalmente son muy maleables.\r\n"
				+ "\r\n"
				+ "Estos minerales met�licos tambi�n se asocian o se conocen como elementos nativos met�licos, debido a que aparecen en la naturaleza son estar combinados qu�micamente con ning�n otro elemento qu�mico. Los ejemplos m�s importantes de este grupo de minerales incluyen al oro, la plata, el cobre, el zinc, y el plomo.");
		
	}

}
