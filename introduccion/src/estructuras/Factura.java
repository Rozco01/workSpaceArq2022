package estructuras;
import java.util.Scanner;
public class Factura {

	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre del cliente");
		String nombreCliente = entrada.nextLine();
		
		System.out.println("tipo de cliente 1) super-especial 2) especial 3) nuevo");
		int tipoCliente = entrada.nextInt();
		
		
		System.out.println("Articulos Comprados");
		
		String rta ="si";
		int cntArticulos = 0;
		double valorArticulo = 0D, totalComprado = 0.0;
		while (rta.equals("si")){
			cntArticulos++;
			
			System.out.println("Valor del articulo #"+cntArticulos);
			valorArticulo = entrada.nextDouble();
			totalComprado = totalComprado+valorArticulo;
			
			System.out.println("¿Otro articulo?");
			rta = entrada.next();
		}
		
		
		
		double valorDescuento = 0D;
		
		if(tipoCliente == 1){
			valorDescuento = (valorArticulo*0.3);
		}else if (tipoCliente == 2) {
			valorDescuento= (valorArticulo*0.2);
		}else if (tipoCliente == 3){
			valorDescuento= (valorArticulo*0.1);
		}
		double totalPagar = 0.0; 
		totalPagar = valorArticulo*valorDescuento;
		
		System.out.println("=========================");
		System.out.println("== Cliente: " +nombreCliente);
		System.out.println("== Tipo: " +tipoCliente);
		System.out.println("== valorDescuento: " +valorDescuento);
		System.out.println("== Total a pagar: " +totalPagar);
 	}
}
