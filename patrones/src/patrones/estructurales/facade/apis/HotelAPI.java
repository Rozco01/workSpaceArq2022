/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.facade.apis;
/**
 *
 * @author Jefferson
 */
public class HotelAPI {
    public void buscarHoteles(String fechaIda, String fechaSalida){
      
        
        System.out.println("==================================");
        System.out.println("HOTELES ENCONTRADOS");
        System.out.println("Fecha Ida:" +fechaIda+ " Fecha Regreso " + fechaSalida);
        
        System.out.println("==> Hotel A");
        System.out.println("==> Hotel B");
        System.out.println("==> Hotel C");
        System.out.println("==> Hotel D");
        System.out.println("==> Hotel E");
       
        System.out.println("==================================");
    }
}
