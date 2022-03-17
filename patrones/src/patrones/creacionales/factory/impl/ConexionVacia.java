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

public class ConexionVacia implements IConexion{

    public ConexionVacia() {
        System.out.println("No se especifico el motor de BD");
    }

    
    @Override
    public void conectar() {
    System.out.println("No se especifico el motor de BD");
    }

    @Override
    public void desconectar() {
    System.out.println("No se especifico el motor de BD");
    }
    
}
