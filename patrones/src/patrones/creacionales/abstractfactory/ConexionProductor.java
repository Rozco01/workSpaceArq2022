/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory;

/**
 *
 * @author Jefferson
 */
public class ConexionProductor {
    
    public static IConexionAbstractFactory getFactory(String tipoFabrica) {
        if(tipoFabrica.equalsIgnoreCase("DB")){
            return new ConexionDBFactory();
        }else if(tipoFabrica.equalsIgnoreCase("SERVICIOWB")){
            return new ConexionSrvWebFactory();
        }
        return null;
    }
    
    
}
