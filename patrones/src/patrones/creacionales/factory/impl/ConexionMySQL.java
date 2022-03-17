/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factory.impl;

/**
 *
 * @author Jefferson
 */
import patrones.creacionales.factory.IConexion;
public class ConexionMySQL implements IConexion{

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }
    
    

    @Override
    public void conectar() {
        System.out.println("Se conecto a la BD MySQL");
    }

    @Override
    public void desconectar() {
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host+ ", puerto=" + puerto + ", usuario= " +usuario+ ",contrasana=" +contrasena+"]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
