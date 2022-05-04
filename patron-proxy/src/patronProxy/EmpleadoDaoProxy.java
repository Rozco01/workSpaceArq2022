package patronProxy;

import patronProxy.Proxymodel.Empleado;
import patronProxy.Proxymodel.EmpleadoDao;

public class EmpleadoDaoProxy implements EmpleadoDao{
	
	
	private final EmpleadoDao empleadoDao;
	public EmpleadoDaoProxy(EmpleadoDao empleadoDao){
		this.empleadoDao = empleadoDao;
	}

	public Empleado findById(int id) {
		System.out.println("Aplicando proxy antes de encontrar el id");
		Empleado E = this.empleadoDao.findById(id);
		System.out.println("Aplicando proxy despues de encontrar el id");
		return E;
	}

	public Empleado save(Empleado empleado) {
		System.out.println("Aplicando proxy antes de guardar el empleado");
		Empleado E = this.empleadoDao.save(empleado);
		System.out.println("Aplicando proxy despues de guardar el empleado");
		return null;
	}

}
