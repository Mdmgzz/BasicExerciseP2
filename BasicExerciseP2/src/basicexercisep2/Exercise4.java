package basicexercisep2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//bloque de variables
		boolean lluvia,biblioteca,deberes;
		boolean salir;
		// preguntamos al usuario si esta lloviendo , si ha hecho los deberes y si necesita ir a la biblio
		Scanner sc= new Scanner(System.in);
		System.out.print("Esta lloviendo?");
		lluvia = sc.nextBoolean();
		System.out.print("Has hecho los deberes?");
		biblioteca = sc.nextBoolean();
		System.out.print("Necesitas ir a la biblioteca?");
		deberes = sc.nextBoolean();
		/*ahora vamos a comparar sus respuestas
		 si esta lloviendo no puede salir
		 si no ha hecho los deberes no puede salir 
		 pero si no ha hecho los deberes y esta lloviendo pero necesita ir a la biblio puede salir 
		*/ 
		salir = (!lluvia && deberes)|| biblioteca ;
		System.out.print("¿puedo salir? "+(salir ? "Si" : "No"));
		sc.close();
	}

}
