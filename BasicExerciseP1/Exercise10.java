package ejerciciosbasicos;

import java.util.Scanner;

public class Exercise10 {

	public static void main (String[] args) {
		//bloque de variables y constantes
		final   int IVA = 21 ;
		double iva, precio, op;
		// solicitamos el precio y realizamos la op
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un precio: ");
		precio = sc.nextDouble();
		IVA= 21;
		op = IVA*precio/100;
		//mostramos el resultado
		System.out.print(" El resultado del precio con el IVA es de :"+ op);
		
	}

}
