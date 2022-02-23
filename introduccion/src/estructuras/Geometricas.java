package estructuras;

import java.util.Scanner;

public class Geometricas {
	
	static Scanner entrada = new Scanner(System.in);
	
	public Geometricas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t*************************");
		System.out.println("\t********* MENU **********");
		System.out.println("\t*************************");
		System.out.println("\t1. ?");
		System.out.println("\t*************************");
		System.out.println("\tIngese su opcion: ");
		int opcion = entrada.nextInt();
		
		switch(opcion){
		case 1: dibujarfigura1();
		break;
		
		default: opcionErrada();
		break;
		}
	}

	private static void opcionErrada() {
		// TODO Auto-generated method stub
		int tam,fila,col;
		
		System.out.println("\tTamano: ");
		tam = entrada.nextInt();
		
		for(fila=1; fila<=tam; fila++){
			for(col=1; fila<=tam; col++){
				System.out.println("*");
			}
			System.out.println("*");
		}
	}

	private static void dibujarfigura1() {
		// TODO Auto-generated method stub
		
	}

}
