
package patrones.estructurales.facadepractica1;

/**
 *
 * @author Jefferson
 */
public class AplicacionEjemplo {
    public static void main(String[] args) {
        CheckFacadeEjemplo encryp1 = new CheckFacadeEjemplo();
        encryp1.Enviar("Hola");
        CheckFacadeEjemplo encryp2 = new CheckFacadeEjemplo();
        encryp1.Enviar("Hola mundo");
        CheckFacadeEjemplo encryp3 = new CheckFacadeEjemplo();
        encryp1.Enviar("Hola profe");
    }
}
