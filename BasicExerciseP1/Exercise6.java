package ejerciciosbasicos;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		//bloque de variables
		double primernumero,segnumero,suma,resta,mult,div;
		// vamos a solicitarle al usuario los numeros
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un el primer numero: ");
		primernumero = sc.nextDouble();
		System.out.println("Introduzca un el segundo numero: ");
		segnumero = sc.nextDouble();
		//realizamos las operaciones 
		suma = primernumero + segnumero;
		resta = primernumero - segnumero;
		mult = primernumero * segnumero;
		div = primernumero / segnumero;
		// una vez hechas las op las mostramos al usuario
		System.out.println("El resultado de la suma es: "+ suma);
		System.out.println("El resultado de la resta es: "+ resta);
		System.out.println("El resultado de la multiplicación es: "+ mult);
		System.out.println("El resultado de la división es: "+ div);
		sc.close();
	}

}
