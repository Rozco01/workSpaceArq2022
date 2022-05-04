package patronProxy;

import patronProxy.Proxymodel.Empleado;
import patronProxy.Proxymodel.EmpleadoDao;

public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Patron proxy implementado para el acceso de empleados");
		EmpleadoDao empleadoDao = new EmpleadoDaoImpl();
		
		System.out.println(" 1) sin proxy de muestra");
		Empleado E1 = empleadoDao.findById(1054);
		empleadoDao.save(E1);
		
		System.out.println(" 2) con proxy de muestra");
		EmpleadoDaoProxy empleadoDaoProxy = new EmpleadoDaoProxy(empleadoDao);
		Empleado E2 = empleadoDaoProxy.findById(1054);
		empleadoDaoProxy.save(E2);
		
	}

}
