/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.prototype;

import patrones.creacionales.prototype.model.CuentaAhorroImpl;

public class Aplicacion {
   
    public Aplicacion(){
    
    }
    
    public static void main(String[] args) {
        CuentaAhorroImpl cuentaAhorroPadre = new CuentaAhorroImpl();
        cuentaAhorroPadre.setBanco("Banco Popular");
        cuentaAhorroPadre.setDirbanco("Cra 34 52-35");
        cuentaAhorroPadre.setMonto(50000);
        
        
        
        CuentaAhorroImpl cuentaClonada = (CuentaAhorroImpl) cuentaAhorroPadre.clonarCuenta();
        cuentaClonada.setMonto(100000);
        
        System.out.println(cuentaAhorroPadre);
        System.out.println(cuentaClonada);
    }
    
}

