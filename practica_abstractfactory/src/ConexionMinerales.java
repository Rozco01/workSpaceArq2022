import factory_animales.IAnimales;
import factory_minerales.IMinerales;
import factory_minerales.impl.*;
import factory_minerales.impl.PiedrasPreciosas;
import factory_plantas.IPlantas;


public class ConexionMinerales implements IConexionAbstractFactory{

	public ConexionMinerales() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAnimales getConexionAnimalesFactory(String especie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPlantas getConexionPlantasFactory(String especie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMinerales getConexionMineralesFactory(String tipo) {
		IMinerales mineral =  new MineralVacio();
		
		
		if(tipo.equalsIgnoreCase("Metalicos")) {
			mineral = new Metalicos();
		}
		
		else if(tipo.equalsIgnoreCase("No metalicos")) {
			mineral = new NoMetalicos();
		}
		
		else if(tipo.equalsIgnoreCase("Piedras preciosas")) {
			mineral = new PiedrasPreciosas();
		}
		
		
		return mineral;
	}

}
