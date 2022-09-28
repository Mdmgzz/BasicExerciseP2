package ejerciciosbasicos;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// Bloque de variables
		int edad;
		String nombre;
		// solicitamos al usuario su edad y su nombre
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		//mostramos al usuario su edad y nombre
		System.out.print("“Hola "+ nombre +", tienes "+ edad +" años, ¡qué mayor eres!”");
		sc.close();
	}

}
