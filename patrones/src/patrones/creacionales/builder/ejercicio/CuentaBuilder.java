package patrones.creacionales.builder.ejercicio;

public class CuentaBuilder {

	//Datos necesarios
		private String nombre;
		private String cedula;
		
		//Datos inecesarios
		private String trabajo;
		private int edad;
		private long telefono;
		private String direccion;
		
		public CuentaBuilder() {}
		
		public Cuenta build() {
			return new Cuenta(this);
		}

		
		//Getter and Setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getTrabajo() {
			return trabajo;
		}

		public void setTrabajo(String trabajo) {
			this.trabajo = trabajo;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public long getTelefono() {
			return telefono;
		}

		public void setTelefono(long telefono) {
			this.telefono = telefono;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		//Constructores del builder
		public CuentaBuilder datos(String pNombre, String pCedula) {
			this.nombre = pNombre;
			this.cedula = pCedula;
			return this;
		}
		
		public CuentaBuilder telefono(long  pTelefono) {
			this.telefono = pTelefono;
			return this;
		}
	
}
