package impl;

import clases.ISedes;

public class sedeQuirurjica implements ISedes {
    // Declaraciones
    private int nro;
    private String nombre;
    private String desc;

    private int tot;

    // Getters y setters, método default

    public sedeQuirurjica() {
        this.nro = 675;
        this.nombre = "Sede Quirurjica";
        this.desc = "En esta sede se maneja los elementos para cirujías.";
    }
    
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    // ------

    @Override
    public void addInsumo(int cant) {
        tot = cant + this.nro;
        setNro(tot);
        System.out.println("Se ha añadido: " + cant);
        System.out.println("Total actual: " + this.nro);
    }

    @Override
    public void getStock() {
        System.out.println("Stock de " + getNombre() + ": " + getNro());
    }
    
    @Override
    public void showStockSede() {
        System.out.println("Total actual de: " + getNombre() + " es de: "  + getNro());
        System.out.println(getDesc());
    }
}