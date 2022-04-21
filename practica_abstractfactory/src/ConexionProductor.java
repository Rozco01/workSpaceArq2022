
public class ConexionProductor {

public static IConexionAbstractFactory getFactory(String tipoFabrica) {
		
		if (tipoFabrica.equalsIgnoreCase("ANIMALES")) {
			return new ConexionAnimales();
		}
		
		else if (tipoFabrica.equalsIgnoreCase("MINERALES")){
			return new ConexionMinerales();
		}
		
		else if (tipoFabrica.equalsIgnoreCase("PLANTAS")){
			return new ConexionPlantas();
		}
		
		return null;
	}

}
