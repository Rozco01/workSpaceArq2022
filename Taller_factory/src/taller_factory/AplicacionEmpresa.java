/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_factory;



/**
 *
 * @author Jefferson
 */
public class AplicacionEmpresa {
          
    public static void main(String[] args) {
        ConexionSedes fabrica = new ConexionSedes();

        
        ISede sed_1 = fabrica.getSedes("DEF");
        sed_1.addInsumo(46);
        sed_1.getStock();
        sed_1.showStockSede();

        ISede sed_2 = fabrica.getSedes("MED");
        sed_2.addInsumo(77);
        sed_2.getStock();
        sed_2.showStockSede();

        ISede sed_3 = fabrica.getSedes("QUI");
        sed_3.addInsumo(63);
        sed_3.getStock();
        sed_3.showStockSede();
    }
}
