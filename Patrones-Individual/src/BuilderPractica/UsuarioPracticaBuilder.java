package BuilderPractica;

public class UsuarioPracticaBuilder {

	//Atributos obligadorios
	private long id;
	
	//Atributos opcionales
	private String referencia;
	private String nombre;
	private String descripcion;
	private double PrecioUnitario;
	private long Stock;
	private double PrecioMayorista;
	
	public UsuarioPracticaBuilder() {
	}
	
	public UsuarioPractica build() {
		return new UsuarioPractica(this);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return PrecioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}

	public long getStock() {
		return Stock;
	}

	public void setStock(long stock) {
		Stock = stock;
	}

	public double getPrecioMayorista() {
		return PrecioMayorista;
	}

	public void setPrecioMayorista(double precioMayorista) {
		PrecioMayorista = precioMayorista;
	}
	
	//Constructores del builder
	
	public UsuarioPracticaBuilder id(long pId) {
		this.id = pId;
		return this;
	}
	
	public UsuarioPracticaBuilder id2(long pId, String pReferencia) {
		this.id = pId;
		this.referencia = pReferencia;
		return this;
	}
	
	public UsuarioPracticaBuilder id3(long pId, String pReferencia, String pNombre) {
		this.id = pId;
		this.referencia = pReferencia;
		this.nombre = pNombre;
		return this;
	}
	
	public UsuarioPracticaBuilder id4(long pId, double pPreciouni, double pPreciomayo) {
		this.id = pId;
		this.PrecioUnitario = pPreciouni;
		this.PrecioMayorista = pPreciomayo;
		return this;
	}
	
	public UsuarioPracticaBuilder id5(long pId, String pDescripcion, long pStock) {
		this.id = pId;
		this.descripcion = pDescripcion;
		this.Stock = pStock;
		return this;
	}
	
	
}
