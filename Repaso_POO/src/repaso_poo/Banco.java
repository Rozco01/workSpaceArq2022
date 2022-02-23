/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_poo;

/**
 *
 * @author Jefferson
 */
public class Banco {
    private long nitBanco;
    private String nombreBanco;
    private String direccion;
    private int nombreGerente;
    private char numSucursales;

    public Banco(){

    }

    public long getNitBanco() {
        return nitBanco;
    }

    public void setNitBanco(long nitBanco) {
        this.nitBanco = nitBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(int nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public char getNumSucursales() {
        return numSucursales;
    }

    public void setNumSucursales(char numSucursales) {
        this.numSucursales = numSucursales;
    }
} 

