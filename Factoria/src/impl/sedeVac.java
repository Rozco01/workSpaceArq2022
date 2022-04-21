package impl;

import clases.ISedes;

public class sedeVac implements ISedes {
   
    public sedeVac(){
        System.out.println("No se especificó");
    }

    @Override
    public void addInsumo(int cant) {
        System.out.println("No se especificó");
    }

    @Override
    public void getStock() {
        System.out.println("No se especificó");    }
    
    @Override
    public void showStockSede() {
        System.out.println("No se especificó");
    }
}