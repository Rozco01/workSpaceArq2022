/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factory;

/**
 *
 * @author Jefferson
 */
public class AplicacionFactory {
    public static void main(String[] args) {
        ConexionFactory fabrica = new ConexionFactory();
        IConexion conn1 = fabrica.getConexion("mySQL");
        conn1.conectar();
        conn1.desconectar();
       
        
    }
}
