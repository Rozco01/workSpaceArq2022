/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_factory.impl;

import taller_factory.ISede;

/**
 *
 * @author Jefferson
 */
public class sedeQuirurjica implements ISede{
    
    private int num;
    private String nombre;
    private String des;

    private int total;
    
    public sedeQuirurjica(){
        this.num = 254;
        this.nombre = "SEDE DE QUIRURJISCO";
        this.des = "Esta sede maneja los insumos quirurjicos";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
    @Override
    public void addInsumo(int n) {
        total = n + this.num;
        setNum(total);
        System.out.println("Se añidieron :" + n);
    }

    @Override
    public void getStock() {
        System.out.println("Stock de " +getNombre()+": " + getNum());
    }

    @Override
    public void showStockSede() {
        System.out.println("Stock de " +getNombre()+": " + getNum()+ "\n" +getDes());
    }
     
}
