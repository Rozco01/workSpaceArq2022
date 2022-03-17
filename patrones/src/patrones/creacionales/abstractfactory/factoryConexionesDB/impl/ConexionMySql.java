/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.factoryConexionesDB.impl;

import patrones.creacionales.abstractfactory.factoryConexionesDB.IConexionDB;

/**
 *
 * @author Jefferson
 */
public class ConexionMySql implements IConexionDB{
    
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySql() {
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
    public void deconectar() {
        System.out.println("Se desconecto de la BD MySQL");
    }  

    
}
