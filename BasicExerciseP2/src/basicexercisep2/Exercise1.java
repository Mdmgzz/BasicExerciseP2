package basicexercisep2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// bloque de variables
		double precioperas, preciomanzanas,kgperas,kgmanzanas,operacion;
		//solicitamos al cliente las ventas y definimos las variables del precio
		preciomanzanas= 2.35 ;
		precioperas = 1.95 ;
		Scanner sc = new Scanner (System.in);
		System.out.print("¿Cuantos kg has venido de peras?");
		kgperas = sc.nextDouble();
		System.out.print("¿Cuantos kg has venido de manzanas?");
		kgmanzanas = sc.nextDouble();
		// ahora realizamos la op en otra variable
		operacion= kgmanzanas*preciomanzanas + kgperas * precioperas ;
		//ahora por ultimo le mostramos al cliente el resultado
		System.out.print("el total de los beneficios es de: " + operacion + "€");
		sc.close();
	}

}
