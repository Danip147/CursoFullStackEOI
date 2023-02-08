/**
 * Crea un programa que vaya leyendo lo que el usuario escribe en consola y lo escriba en un
 * fichero (línea a línea). Terminará cuando el usuario escriba la palabra ‘FIN’.
 */

package ejercicios02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio02 {

	public static void ejercicio02(String nombreFichero) {
		Scanner sc = new Scanner(System.in);

		String linea;
		try { // esto crea el fichero vacio 
			Files.writeString(Paths.get(nombreFichero), "");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		do { // vamos añadiendo linea a linea hasta que pogan la palabra "fin"
			System.out.println("Introduzca la línea que quiere insertar en el fichero (FIN para salir): ");
			linea = sc.nextLine();
			if (!linea.equalsIgnoreCase("fin")) {
				try {
					Files.writeString(Paths.get(nombreFichero), linea + "\n", StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} while (!linea.equalsIgnoreCase("fin"));

		sc.close();
	}

	public static void main(String[] args) {

		ejercicio02("C:/ficheros/ejercicio2.txt");

	}

}
