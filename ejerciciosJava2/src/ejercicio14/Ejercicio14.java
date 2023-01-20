/**
 * 14. Inicializa una variable entera a 0. Después, pregunta al usuario por un número y súmaselo a la 
 * variable inicial. Repite esto hasta que el usuario introduzca el número cero. Utiliza el bucle 
 * do..while.
 */


package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void Ejercicio14() {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Introduzca un número");
			int numeroUsuario = sc.nextInt();
			if(numeroUsuario == 0) {
				break;
			}
			numero += numeroUsuario;
		}
		
		
		
		sc.close();
	}

	public static void main(String[] args) {
		Ejercicio14();

	}

}
