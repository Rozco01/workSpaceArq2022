/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_factory;

/**
 *
 * @author Jefferson
 */

/*Un programador que pertenece a varios bancos desea
crear una aplicacion para el ingreso y
retiro de dinero en cada banco*/
public class AplicacionBanco {
    public static void main(String[] args) {
        ConexionBancos fabrica = new ConexionBancos();
        
        
        IBancos sed_1 = fabrica.getBancos("AVVILLAS");
        sed_1.agregarDinero(500000);
        sed_1.retirarDinero(100000);
        sed_1.mostarCuentas();

        IBancos sed_2 = fabrica.getBancos("BANCOLOMBIA");
        sed_2.agregarDinero(60000);
        sed_2.retirarDinero(1000000);
        sed_2.mostarCuentas();
        
        IBancos sed_3 = fabrica.getBancos("BBVA");
        sed_3.agregarDinero(300000);
        sed_3.retirarDinero(50000);
        sed_3.mostarCuentas();
    }
    
}
