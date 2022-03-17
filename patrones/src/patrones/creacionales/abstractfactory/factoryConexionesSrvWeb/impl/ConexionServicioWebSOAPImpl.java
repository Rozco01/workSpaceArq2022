/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import patrones.creacionales.abstractfactory.factoryConexionesSrvWeb.IConexionServicioWeb;

/**
 *
 * @author Jefferson
 */
public class ConexionServicioWebSOAPImpl implements IConexionServicioWeb{
        private String url;
    private String parametrosE;
    private String parametrosS;

    public ConexionServicioWebSOAPImpl() {
        this.url = null;
        this.parametrosE = null;
        this.parametrosS = null;
    }
    
    @Override
    public void conectarServicio() {
        System.out.println("Conexion Generica A Servicion Web Soap obtenida.");
    }

    @Override
    public String enviarMensaje(String mensaje) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        
        String recibido = "message received   " + mensaje;
        String respuesta = "message processed at  " + formatter.format(date);
        return toString() + recibido + " " + respuesta;
    }

    @Override
    public void deconectarServicio() {
    System.out.println("Desconexion Generica A Servicion SOAP.");
    }

    @Override
    public String toString() {
        return "ConexionServicioWebSOAPImpl{" + "url=" + url + ", parametrosE=" + parametrosE + ", parametrosS=" + parametrosS + '}';
    }
    
    
}
