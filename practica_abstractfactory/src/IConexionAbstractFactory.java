import factory_animales.IAnimales;
import factory_minerales.IMinerales;
import factory_plantas.IPlantas;


public interface IConexionAbstractFactory {
	IAnimales getConexionAnimalesFactory(String especie); //retornan interfaces
	IPlantas getConexionPlantasFactory(String especie); //retornan interfaces
	IMinerales getConexionMineralesFactory(String tipo); //retornan interfaces
}
