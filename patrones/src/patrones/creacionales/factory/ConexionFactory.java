/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factory;

import patrones.creacionales.factory.impl.ConexionMySQL;
import patrones.creacionales.factory.impl.ConexionVacia;

/**
 *
 * @author Jefferson
 */
public class ConexionFactory {
   
    public IConexion getConexion(String motor){
        if (motor == null) {
            return new ConexionVacia();
        }
        else if(motor.equalsIgnoreCase("MySQL")){
                return new ConexionMySQL();
        }
        return new ConexionMySQL();
    }
    
}
