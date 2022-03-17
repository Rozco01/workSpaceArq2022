/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IConexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionH2;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionMySql;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionOracle;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionSqlServer;
import patrones.creacionales.abstractfactory.factoryConexionesDB.impl.ConexionVacia;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

/**
 *
 * @author Jefferson
 */
public class ConexionDBFactory implements IConexionAbstractFactory{
    
    public ConexionDBFactory(){
    }
    
    
    @Override
    public IConexionDB getConexionDB(String motor) {
        IConexionDB conn2Return = new ConexionVacia();
        if (motor == null) {
            return conn2Return;
        } else if(motor.equalsIgnoreCase("MySql")){
             conn2Return =  new ConexionMySql();
        }else if(motor.equalsIgnoreCase("Oracle")){
            conn2Return =  new ConexionOracle();
        }else if(motor.equalsIgnoreCase("H2")){
             conn2Return =  new ConexionH2();
        }else if(motor.equalsIgnoreCase("SqlServer")){
             conn2Return =  new ConexionSqlServer();
        } 
        return conn2Return;
    }

    @Override
    public IConexionServicioWeb getConexionServicioWeb(String tipoServicio) {
    return null;
    }
    
    
}
