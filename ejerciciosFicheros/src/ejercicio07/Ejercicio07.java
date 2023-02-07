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
	
		public static List<String> devolverLineasJava8(Path ruta) {

			try { // intenta ejecutar este codigo
				List<String> lineas = Files.readAllLines(ruta, Charset.forName("UTF-8"));
				return lineas;
			} catch (IOException e) {
				System.out.println("No se puede acceder al fichero"); // mensaje de ERROR personalizado
				return null; // tiene que devolver algo
			}

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
//			int numeroAzar = new Random().nextInt(datosDevueltos.size());
			System.out.println("La palabra aletoria es: " + datosDevueltos.get(azar));
		} 
			
			
//			Random rand = new Random();
//		    int index = rand.nextInt(datosDevueltos.size());
//		    String palabraRandom = datosDevueltos.get(index);
//		    System.out.println("La palabra elegida al azar es: " + palabraRandom);
	}

}
