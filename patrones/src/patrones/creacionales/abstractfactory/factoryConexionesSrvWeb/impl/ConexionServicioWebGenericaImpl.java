/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl;

import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

/**
 *
 * @author Jefferson
 */
public class ConexionServicioWebGenericaImpl implements IConexionServicioWeb{
    
    private String url;
    private String parametrosE;
    private String parametrosS;

    public ConexionServicioWebGenericaImpl() {
        this.url = null;
        this.parametrosE = null;
        this.parametrosS = null;
    }
    
    @Override
    public void conectarServicio() {
        System.out.println("Conexion Generica A Servicion Web."
                + "\n Especifique Un tipo de Servicion Web Valido");
    }

    @Override
    public String enviarMensaje(String mensaje) {
        return "No Se Puede Enviar El Mensaje."
         + "\n A Una Conexion Generica Debe Especificar Un Tipo De Servicio Web";
    }

    @Override
    public void deconectarServicio() {
    System.out.println("Desconexion Generica A Servicion Web."
                + "\n Especifique Un tipo de Servicion Web Valido");
    }
    
    
}
