import factory_animales.IAnimales;
import factory_animales.impl.*;
import factory_minerales.IMinerales;
import factory_plantas.IPlantas;


public class ConexionAnimales implements IConexionAbstractFactory{

	public ConexionAnimales() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAnimales getConexionAnimalesFactory(String especie) {
		IAnimales animal =  new AnimalVacio();
		
		
		if(especie.equalsIgnoreCase("ANFIBIOS")) {
			animal = new Anfibios();
		}
		
		else if(especie.equalsIgnoreCase("AVES")) {
			animal = new Aves();
		}
		
		else if(especie.equalsIgnoreCase("MAMIFEROS")) {
			animal = new Mamiferos();
		}
		
		else if(especie.equalsIgnoreCase("PECES")) {
			animal = new Peces();
		}
		
		else if(especie.equalsIgnoreCase("REPTILES")) {
			animal = new Reptiles();
		}
		
		return animal;
	}

	@Override
	public IPlantas getConexionPlantasFactory(String especie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMinerales getConexionMineralesFactory(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
