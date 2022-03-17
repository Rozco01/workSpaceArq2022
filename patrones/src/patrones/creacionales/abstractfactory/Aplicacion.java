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
public class Aplicacion {
    public static void main(String[] args) {
        IConexionAbstractFactory fabricaDB = ConexionProductor.getFactory("DB");
        IConexionDB motorMysql = fabricaDB.getConexionDB("MySql");
        motorMysql.conectar();
        motorMysql.deconectar();
        
        IConexionAbstractFactory fabricaSrvWeb = ConexionProductor.getFactory("SERVICIOWB");
        IConexionServicioWeb motorSrvWebRest = fabricaSrvWeb.getConexionServicioWeb("REST");
        motorSrvWebRest.conectarServicio();
        String rta = motorSrvWebRest.enviarMensaje("mensaje Rest");
        System.out.println(rta);
        motorSrvWebRest.deconectarServicio();
    }
}
