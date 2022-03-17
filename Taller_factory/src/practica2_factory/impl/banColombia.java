/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_factory.impl;

import practica2_factory.IBancos;

/**
 *
 * @author Jefferson
 */
public class banColombia implements IBancos{
    private double dinero;
    private String nombre;

    public banColombia() {
        this.dinero = 1500000;
        this.nombre = "BanColombia";
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregarDinero(double num) {
        setDinero(getDinero()+num);
        System.out.println("Se han añadido a la cuenta: " +num);
    }

    @Override
    public void retirarDinero(double num) {
        setDinero(getDinero()-num);
        System.out.println("Se han retirado de la cuenta: " +num);
    }

    @Override
    public void mostarCuentas() {
        System.out.println("El dinero de la cuenta " + getNombre() + " es de: " +getDinero());
    }
}
