import factory_animales.IAnimales;

import factory_minerales.IMinerales;
import factory_plantas.IPlantas;
import factory_plantas.impl.Arboles;
import factory_plantas.impl.*;

public class ConexionPlantas implements IConexionAbstractFactory{

	public ConexionPlantas() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAnimales getConexionAnimalesFactory(String especie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPlantas getConexionPlantasFactory(String especie) {
		IPlantas planta =  new PlantasVacio();
		
		
		if(especie.equalsIgnoreCase("ARBOLES")) {
			planta = new Arboles();
		}
		
		else if(especie.equalsIgnoreCase("Arbustos")) {
			planta = new Arbustos();
		}
		
		else if(especie.equalsIgnoreCase("Hierbas")) {
			planta = new Hierbas();
		}
		
		else if(especie.equalsIgnoreCase("Matas")) {
			planta = new Matas();
		}
		
		
		return planta;
	}

	@Override
	public IMinerales getConexionMineralesFactory(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
