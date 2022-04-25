package BuilderPractica;

public class UsuarioPractica {

	
	//Atributos obligadorios
			private long id;
			
			//Atributos opcionales
			private String referencia;
			private String nombre;
			private String descripcion;
			private double PrecioUnitario;
			private long Stock;
			private double PrecioMayorista;
			
	public UsuarioPractica() {	
	}
	
	public UsuarioPractica(UsuarioPracticaBuilder builder) {
		if(builder.getId() == 0) {
			throw new IllegalArgumentException("el ID es requerido");
		}
		this.id = builder.getId();
		this.referencia = builder.getReferencia();
		this.nombre = builder.getNombre();
		this.descripcion = builder.getDescripcion();
		this.PrecioUnitario = builder.getPrecioUnitario();
		this.Stock = builder.getStock();
		this.PrecioMayorista = builder.getPrecioMayorista();
	}
	
	@Override
    public String toString() {
		return "ID :" +id +" referencia: " +referencia+ " Nombre: " +nombre+ " descripcion: " +descripcion+ " Precio unitario: " +PrecioUnitario + " Precio Mayorista: " +PrecioMayorista+ " Stock: " +Stock;
	}
}
