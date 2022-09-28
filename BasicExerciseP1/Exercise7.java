package ejerciciosbasicos;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
				//bloque de variables
		String nombre,direccion,tlf;
				// vamos a solicitarle al usuario los numeros
				Scanner sc= new Scanner(System.in);
				System.out.println("Introduzca su nombre: ");
				nombre = sc.nextLine();
				System.out.println("Introduzca su direcciñon: ");
				direccion = sc.nextLine();
				System.out.println("Introduzca su telefono: ");
				tlf = sc.nextLine();
				// ahora le mostramos al usario las indicaciones que el mismo nos ha dado 
				System.out.println("Nombre: "+ nombre);
				System.out.println("Dirección: "+ direccion);
				System.out.println("Telefono: "+ tlf);
				sc.close();
	}

}
