package patrones.estructurales.facade;

import patrones.estructurales.facade.apis.AvionAPI;
import patrones.estructurales.facade.apis.HotelAPI;

/**
 *
 * @author Jefferson
 */
public class CheckFacade {
    public AvionAPI avionApi;
    public HotelAPI hotelApi;
    
    public CheckFacade(){
        avionApi = new AvionAPI();
        hotelApi = new HotelAPI();
    }
    
    public void buscar(String fechaIda,String fechaVuelta, String origen, String destino){
        avionApi.buscarVuelos(fechaIda, fechaVuelta, origen, destino, 0);
        hotelApi.buscarHoteles(fechaIda, fechaVuelta);
    }
    
    
}
