package patronProxy;

import patronProxy.Proxymodel.Empleado;
import patronProxy.Proxymodel.EmpleadoDao;

public class EmpleadoDaoImpl implements EmpleadoDao {

	public Empleado findById(int id) {
		System.out.println("Buscando el empleado con id = " +id);
		
		return new Empleado(id, "Generico", "General");
	}

	public Empleado save(Empleado empleado) {
		System.out.println("Guardando nuevo empleado...");
		return empleado;
	}
	

	

}
