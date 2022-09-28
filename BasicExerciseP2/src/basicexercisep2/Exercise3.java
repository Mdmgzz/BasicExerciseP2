package basicexercisep2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
			//bloque de variables
				int numero,par;
				boolean falso;
				//creamos el scanner y le pedimos al cliente un numero
				Scanner sc= new Scanner(System.in);
				System.out.print("Introduzca un numero: ");
				//definimos variables
				numero = sc.nextInt();
				par = numero %2;
				falso = par == 0;
				//mostramos al cliente si el numero es par o no  
				System.out.print("El numero que usted ha escrito es par ? "+ falso);
				sc.close();

	}

}
