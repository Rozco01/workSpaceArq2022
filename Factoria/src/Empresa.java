import clases.ISedes;
import clases.Sedes;

public class Empresa {
    public static void main(String[] args) {
        Sedes fabrica = new Sedes();

        ISedes sed_a = fabrica.getSedes(null);
        sed_a.addInsumo(3);
        sed_a.getStock();
        sed_a.showStockSede();

        ISedes sed_b = fabrica.getSedes("DEF");
        sed_b.addInsumo(3);
        sed_b.getStock();
        sed_b.showStockSede();

        ISedes sed_c = fabrica.getSedes("MED");
        sed_c.addInsumo(2);
        sed_c.getStock();
        sed_c.showStockSede();

        ISedes sed_d = fabrica.getSedes("PRI");
        sed_d.addInsumo(2);
        sed_d.getStock();
        sed_d.showStockSede();

        ISedes sed_e = fabrica.getSedes("QUI");
        sed_e.addInsumo(1);
        sed_e.getStock();
        sed_e.showStockSede();
    }
}
