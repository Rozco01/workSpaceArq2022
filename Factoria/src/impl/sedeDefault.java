package impl;

import clases.ISedes;

public class sedeDefault implements ISedes {
    private int nro;
    private String nombre;
    private String desc;

    private int tot;

    public sedeDefault() {
        this.nro = 675;
        this.nombre = "Sede por Defecto";
        this.desc = "En esta sede se maneja lo predeterminado de la empresa.";
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