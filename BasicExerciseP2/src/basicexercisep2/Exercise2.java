package basicexercisep2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//bloque de variables
		int edad;
		boolean mayor ;
		//creamos el scanner y le pedimos al cliente la edad
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		//definimos variables
		edad = sc.nextInt();
		mayor = edad>=18;
		//mostramos al cliente si es mayor de edad o no 
		System.out.print("Usted es mayor de edad? "+ mayor);
		sc.close();

	}

}
