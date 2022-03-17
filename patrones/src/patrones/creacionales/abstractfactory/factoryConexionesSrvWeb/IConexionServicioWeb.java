/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.factoryConexionesSrvWeb;

/**
 *
 * @author Jefferson
 */
public interface IConexionServicioWeb {
    void conectarServicio();
    String enviarMensaje(String mensaje);
    void deconectarServicio();
}
