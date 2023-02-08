// 7. Haz un programa que pregunte al usuario por el nombre de un fichero y muestra su contenido.
// Observa que cuando el fichero no existe lanza una excepción. Captúrala e informa de que el
// fichero no existe al usuario

// 5. A partir de un archivo que contiene una palabra en cada línea. Carga las palabras en un array*
// y selecciona una al azar. Pide al usuario que la adivine. Tiene 3 intentos.

package ejercicio07;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
	
		/**
		 * Funcion que le pregunta al usuario por un fichero
		 * @return
		 */
		public static String preguntaUsuario() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce nombre de fichero: ");
			String archivo = sc.nextLine();
			return archivo;

		}
		/**
		 * Funcion que intenta ejecutar el fichero
		 * @param ruta
		 * @return
		 */
		public static List<String> devolverLineasJava8(Path ruta) {

			try { // intenta ejecutar este codigo
				List<String> lineas = Files.readAllLines(ruta, Charset.forName("UTF-8"));
				return lineas;
			} catch (IOException e) {
				System.out.println("No se puede acceder al fichero"); // mensaje de ERROR personalizado
				return null; // tiene que devolver algo
			}

		}
		/**
		 * Método para intentar acertar un palabra.
		 * @param palabra
		 */
		public static void aciertaPalabra(String palabra) {
			Scanner sc = new Scanner(System.in);
			
			final int MAXIMO_INTENTOS = 3;
			int contadorIntentos = 0;
			boolean acierto = false;
			
			
			do {
				System.out.println("Introduce palabra: ");
				String opcionUsuario = sc.nextLine().toLowerCase();
				if (opcionUsuario.equals(palabra)) {
					acierto = true;
				}
				contadorIntentos++;
			}while(!acierto && contadorIntentos < MAXIMO_INTENTOS);
			
			if(acierto) {  // He salido del bucle acertando
				System.out.println("¡¡¡Correcto!!! acertaste la palabra, la palabra era: " + palabra);
			} else {
				System.out.println("Gastaste tus intentos. La palabra era " + palabra);
			}
	
			sc.close();
				
		}
	
		
	public static void main(String[] args) {
		
		//pedimos datos al usuario
		String nombreArchivo = preguntaUsuario();
		
		// comprobamos si existe y mostramos
		List<String> datosDevueltos = devolverLineasJava8(Paths.get("C:\\ficheros", nombreArchivo));
			if(datosDevueltos != null) { // Si el fichero devulve lineas, es decir, exite.
			datosDevueltos.forEach(e -> System.out.println(e)); // para cada elemento del conjunto imprime ese elemento "e"
//			*String[] lineasArray = (String[])datosDevueltos.toArray(); // Me transfoma una lista de String en un Array de String
		
			int elementosLista = datosDevueltos.size(); // devuelve el numero de elementos de una lista.
			Random ramdon = new Random(); // crea un objeto de tipo random para sacar numeros aleatorios.
			int azar = ramdon.nextInt(elementosLista); // te saca un numero aleatorio entre 0 y elementosLista -1. 
			
//			int numeroAzar = new Random().nextInt(datosDevueltos.size()); // Lo mismo que lo anterior pero en una liena
			String palabraAleatoria = datosDevueltos.get(azar);
//			System.out.println("La palabra aletoria es: " + datosDevueltos.get(azar)); // El metodo get te coje una poscion de una lista te indica la palabra
			
			aciertaPalabra(palabraAleatoria);
		} 
			

	}

}
