/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IConexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebGenericaImpl;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebRESTImpl;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl.ConexionServicioWebSOAPImpl;

/**
 *
 * @author Jefferson
 */
public class ConexionSrvWebFactory implements IConexionAbstractFactory{

    @Override
    public IConexionDB getConexionDB(String motor) {
    return null;
    }

    @Override
    public IConexionServicioWeb getConexionServicioWeb(String tipoServicio) {
    IConexionServicioWeb conn2Servicio = new ConexionServicioWebGenericaImpl();
        if (tipoServicio.equalsIgnoreCase("SOAP")) {
            conn2Servicio = new ConexionServicioWebSOAPImpl();
        }else if(tipoServicio.equalsIgnoreCase("REST")){
            conn2Servicio = new ConexionServicioWebRESTImpl();
        }
        return conn2Servicio;
    }
    
    
}
