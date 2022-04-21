package patrones.creacionales.builder.sinpatron;

public class Usuario {
	
	private String email;
	private String codigo;
	private String nombre;
	private String apellido;
	private String profesion;
	private int edad;
	private long telefono;
	private String direccion;
	
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
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


	public Usuario(String email, String codigo, String nombre, String apellido) {
		super();
		this.email = email;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public Usuario(String email, String profesion, long telefono) {
		super();
		this.email = email;
		this.profesion = profesion;
		this.telefono = telefono;
	}
	
	
	
}
