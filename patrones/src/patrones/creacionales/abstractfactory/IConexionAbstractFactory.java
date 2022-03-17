/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory;
import patrones.creacionales.abstractfactory.factoryConexionesDB.IConexionDB;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;
/**
 *
 * @author Jefferson
 */
public interface IConexionAbstractFactory {
    IConexionDB getConexionDB(String motor);
    IConexionServicioWeb getConexionServicioWeb(String tipoServicio);
}
