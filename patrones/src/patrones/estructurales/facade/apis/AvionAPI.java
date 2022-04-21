/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.facade.apis;

import java.util.Random;

/**
 *
 * @author Jefferson
 */
public class AvionAPI {
    public void buscarVuelos(String fechaIda, String fechaRegreso, String origen, String destino, int numVuelos){
        Random rnd = new Random();
        
        
        System.out.println("==================================");
        System.out.println("Vuelos encontrados para" +destino+ " desde" +origen);
        System.out.println("Fecha Ida:" +fechaIda+ " Fecha Regreso " + fechaRegreso);
        
        for(int nv = 1; nv <= numVuelos; nv++){
        System.out.println("==> Vuelo #1" + rnd.nextInt());
        }
        System.out.println("==================================");
    }
}
