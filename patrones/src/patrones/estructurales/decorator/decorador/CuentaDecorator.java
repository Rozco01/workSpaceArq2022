/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator.decorador;

import patrones.estructurales.decorator.Cuenta;
import patrones.estructurales.decorator.ICuentaBancaria;

/**
 *
 * @author Jefferson
 */
public abstract class CuentaDecorator implements ICuentaBancaria{
    
    ICuentaBancaria cuentaDecorada;
    
    public CuentaDecorator(ICuentaBancaria pCuentaDecorada){
        this.cuentaDecorada = pCuentaDecorada;
    }
    
    @Override
    public void abrirCuenta(Cuenta pCuenta) {
        this.cuentaDecorada.abrirCuenta(pCuenta);
    }
            
    
    
}
