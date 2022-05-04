/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator.Impl;

import patrones.estructurales.decorator.Cuenta;
import patrones.estructurales.decorator.ICuentaBancaria;

/**
 *
 * @author Jefferson
 */
public class CuentaCorriente implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("Creando Cuenta Corriente ");
        System.out.println("Cliente " +cuenta.getCliente());
    }
    
}
