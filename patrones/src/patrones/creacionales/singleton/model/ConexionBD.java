/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton.model;

/**
 *
 * @author Jefferson
 */
public class ConexionBD {
    /*
    Declaracion del patron
    Debe ser de ambito privada y static
    */
    
    
    private static ConexionBD instancia = null;
    
    /*
    Constructor vacio de la clase
    Ambito private 
    se oculta el constructor, de esta forma solo se puede obtener una instancia de la clase
    utilizando la instancia
    */
    
    private ConexionBD(){   
    }
    
    public static ConexionBD getInstancia(){
        if (instancia == null){
        instancia = new ConexionBD();
            System.out.println("*Creando instancia");
        }else {
            System.out.println("===Retornando instacia ya creada");
        }
    return instancia;
    }
    
    public void conectar(){
        System.out.println("Realizando Conexion con la BD");
    }
    
    public void desconectar(){
        System.out.println("Realizando Desconexion con la BD");
    }
    
}
