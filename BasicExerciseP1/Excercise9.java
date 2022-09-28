package ejerciciosbasicos;

import java.util.Scanner;

public class Excercise9 {

	public static void main(String[] args) {
		// pedimos las variables
		double pesetas,euros;
		//solicitamos las pesetas y euros
		Scanner sc= new Scanner(System.in);
		System.out.println("Introcuce un numero de pesetas");
		pesetas= sc.nextDouble();
		// vamos a realizar la operacion
		euros = pesetas * 0.0060;
		// ahora mostramos el resultado
		System.out.print(pesetas +" pesetas son: "+ euros +"€");
		sc.close();
		
	}

}
