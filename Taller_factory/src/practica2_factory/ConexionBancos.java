/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_factory;

import practica2_factory.impl.banColombia;
import practica2_factory.impl.bancoAVVillas;
import practica2_factory.impl.banco_BBVA;

/**
 *
 * @author Jefferson
 */
public class ConexionBancos {
        public IBancos getBancos(String motor){
        if(motor.equalsIgnoreCase("AVVILLAS")){
            return new bancoAVVillas();
        }
        else if(motor.equalsIgnoreCase("BANCOLOMBIA")){
            return new banColombia();
        }
        else if(motor.equalsIgnoreCase("BBVA")){
            return new banco_BBVA();
        }
            return new bancoAVVillas();
    }
}
