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
public class ConexionVacia implements IConexionDB{

    @Override
    public void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deconectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
            
    
}
