/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator;

import java.util.Random;
import patrones.estructurales.decorator.Impl.CuentaAhorro;
import patrones.estructurales.decorator.Impl.CuentaCorriente;
import patrones.estructurales.decorator.decorador.SeguroAdicionalDecorador;

/**
 *
 * @author Jefferson
 */
public class Aplicacion {
    public static void main(String[] args) {
        Random ncta = new Random();
        
        ICuentaBancaria cuentaCte = new CuentaCorriente();
        ICuentaBancaria cuentaAho = new CuentaAhorro();
        
        //datos 
        Cuenta c = new Cuenta(ncta.nextInt(), "Cliente Anonimo");
        
        //se abre
        //cuentaAho.abrirCuenta(c);
        
        //Agregar decorador
        ICuentaBancaria cuentaBlindada = new SeguroAdicionalDecorador(cuentaAho);
        cuentaBlindada.abrirCuenta(c);
    }
    
    
}
