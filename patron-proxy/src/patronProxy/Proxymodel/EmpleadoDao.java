package patronProxy.Proxymodel;

public interface EmpleadoDao {
	public Empleado findById(int id);
	public Empleado save(Empleado empleado);
}
