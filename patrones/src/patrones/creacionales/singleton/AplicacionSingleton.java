/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton;

import patrones.creacionales.singleton.model.ConexionBD;

/**
 *
 * @author Jefferson
 */
public class AplicacionSingleton {
    
    public static void main(String[] args) {
        ConexionBD conn = ConexionBD.getInstancia();
        conn.conectar();
        conn.desconectar();
        
        
        conn = ConexionBD.getInstancia();
        conn.conectar();
        conn.desconectar();
    }
    
}
