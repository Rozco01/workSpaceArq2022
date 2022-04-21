import factory_animales.IAnimales;
import factory_minerales.IMinerales;
import factory_plantas.IPlantas;

public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		IConexionAbstractFactory fabrica_animales = ConexionProductor.getFactory("Animales");
		IAnimales especie_animal = fabrica_animales.getConexionAnimalesFactory("Anfibios");
		especie_animal.Identificacion();
		especie_animal.Resumen();
		especie_animal.Comida();
		
		IConexionAbstractFactory fabrica_plantas = ConexionProductor.getFactory("plantas");
		IPlantas especie_planta = fabrica_plantas.getConexionPlantasFactory("Arboles");
		especie_planta.Identificacion();
		especie_planta.Resumen();
		especie_planta.Cuidado();
		
		IConexionAbstractFactory fabrica_minerales = ConexionProductor.getFactory("minerales");
		IMinerales tipo_mineral = fabrica_minerales.getConexionMineralesFactory("Metalicos");
		tipo_mineral.Identificacion();
		tipo_mineral.Resumen();
		tipo_mineral.Recomendaciones();

	}

}
