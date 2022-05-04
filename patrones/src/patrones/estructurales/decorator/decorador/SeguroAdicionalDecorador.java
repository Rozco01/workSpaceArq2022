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
public class SeguroAdicionalDecorador extends CuentaDecorator{
    
    public SeguroAdicionalDecorador(ICuentaBancaria pCuentaDecorada) {
        super(pCuentaDecorada);
    }
    
    @Override
    public void abrirCuenta(Cuenta pCuenta) {
        this.cuentaDecorada.abrirCuenta(pCuenta);
        agregarSeguro(pCuenta);
    }
    
    public void agregarSeguro(Cuenta c ){
        System.out.println("Se agrego seguro adicional a la cliente " +c.getId() +" y "+ c.getCliente());
    }
    
}
