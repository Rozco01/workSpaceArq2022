/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_factory;


import taller_factory.impl.*;
/**
 *
 * @author Jefferson
 */
public class ConexionSedes {
        public ISede getSedes(String motor){
        if(motor.equalsIgnoreCase("DEF")){
            return new sedeDefecto();
        }
        else if(motor.equalsIgnoreCase("MED")){
            return new sedeMedicamentos();
        }
        else if(motor.equalsIgnoreCase("QUI")){
            return new sedeQuirurjica();
        }
            return new sedeDefecto();
    }
}
