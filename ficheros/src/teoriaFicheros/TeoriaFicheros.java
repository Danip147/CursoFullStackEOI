package teoriaFicheros;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TeoriaFicheros {

	/**
	 * Funcion que nos lee todo el contenido de un fichero y nos imprime sus líneas por consola
	 * utilizando Java 8.
	 * Files nos permite trabajar con el contenid ode los ficheros
	 * Paths nos permite trabajar con rutas del ordenador (ej: C:/ficheros/archivo.txt)
	 * @param nombreFichero Nombre del fichero en formato texto.
	 * @throws IOException
	 * @author Dani
	 * @since 1.0
	 */
	public static void leerFicheroJava8(String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(nombreFichero)).forEach(l -> System.out.println(l));

	}
	
	/**
	 * Funcion que nos lee todo el contenido de un fichero y nos imprime sus líneas por consola
	 * utilizando Java 8.
	 * Files nos permite trabajar con el contenid ode los ficheros
	 * Paths nos permite trabajar con rutas del ordenador (ej: C:/ficheros/archivo.txt)
	 * @param nombreFichero Nombre del fichero en formato texto.
	 * @throws IOException
	 * 
	 */
	public static void leerFicheroJava8(Path ruta) throws IOException {
		Files.readAllLines(ruta).forEach(l -> System.out.println(l));
	}
	
	
	/**
	 * Método que lee un fichero y devuelve sus líneas en una lista
	 * @param ruta Path con la ruta del fichero
	 * @return Lista de cadenas, una por cada linea.
	 */
	public static List<String> devolverLineasJava8(Path ruta){
		
		try { // intenta ejecutar este codigo
			List<String> lineas = Files.readAllLines(ruta,Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
//			e.printStackTrace(); // mensaje ERROR por defecto del sistema
			System.out.println("No se puede acceder al fichero"); // mensaje de ERROR personalizado
			return null; // tiene que devolver algo
		}
		
	}
	
	
	/**
	 * Escribe un fichero machacando lo anterior
	 * @param ruta Path con la ruta del fichero
	 * @param lineas Lista con las lienas
	 * @return
	 */
	public static boolean escribirLineasJava8(Path ruta, List<String> lineas) {
		try {
			Files.write(ruta, lineas);
			return true;
		} catch (IOException e) {
			System.out.println("Error escribiendo en el fichero");
			return false;
			}
	}
	
	/**
	 * Metodo para añadir elementos
	 * @param ruta
	 * @param lineas
	 * @return
	 */
	public static boolean anyadirLineasJava8(Path ruta, List<String> lineas) {
		try {
			Files.write(ruta, lineas, StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			System.out.println("Error escribiendo en el fichero");
			return false;
			}
	}
	
	
	
	/**
	 * Ejemplo de excepcion de dividir un número entre 0
	 * @param numerador
	 * @param denominador
	 * @return
	 */
	public static int controlarDivisionEntera(int numerador, int denominador) {
		try {
			int resultado = numerador/denominador;
			return resultado;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("No se puede divir por cero");
			return 0;
		}
	}
	
	
	/**
	 * Ejemplo de excepcion introducir numero
	 */
	public static void leerImprimir() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca número");
		
		try {
			int numero = Integer.parseInt(sc.nextLine());
			System.out.println(numero);
		} catch (NumberFormatException e) {
			System.out.println("No ha introducido numero correcto");
		} finally { // NO SIEMPRE DEBE APARECER

			sc.close();
		}

	}
	
	

	public static void main(String[] args) throws IOException {
//		leerFicheroJava8("C:\\ficheros\\alumnos.txt");
//		leerFicheroJava8(Paths.get("datos", "alumnos.txt")); // llamada ruta relativa carpeta DENTRO del proyecto."datos" es el nombre de la carpeta
		
		//LECTURA DE FICHEROS
//		List<String> datosDevueltos = devolverLineasJava8(Paths.get("datos", "alumnos.txt"));
//		if(datosDevueltos != null) { // Si el fichero devulve lineas, es decir, exite.
//			datosDevueltos.forEach(e -> System.out.println(e)); // para cada elemento del conjunto imprime ese elemento "e"
//		} 
//		
//		if (datosDevueltos != null) { // Imprimir los que empiecen por 'M' con programacion extructurada
//			for (String linea : datosDevueltos) {
//				if (linea.charAt(0) == 'D') { // filtro
//					System.out.println(linea);
//				}
//			}
//		}
//		
//		if (datosDevueltos != null) { // Programacion funcional
//			datosDevueltos.stream()
//				.filter(e -> e.charAt(0) == 'D') // filtro
//				.forEach(e -> System.out.println(e));
//			;
//
//		}
	
		// ESCRITURA DE FICHEROS
		
		List<String> lineas = new ArrayList<String>(); // declara una lista de String vacia.
		lineas.add("Linea 1");
		lineas.add("Linea 2");
		lineas.add("Linea 3");
		lineas.add("Linea 4");
		
		// La siguiente lista tiene el mismo contenido que lineas.
		List<String> lineas2 = Arrays.asList("Linea 5", "Linea 6", "Linea 7", "Linea 8");
		
		if(escribirLineasJava8(Paths.get("C:\\ficheros\\alumnosLineas.txt"), lineas)){
			System.out.println("El fichero se escribio correctamnte");
		}else {
			System.out.println("Error al escribir");
		}
		
		if(anyadirLineasJava8(Paths.get("C:\\ficheros\\alumnosLineas.txt"), lineas2)) {
			System.out.println("Las líneas se añadieron correctamnte correctamnte");
		}else {
			System.out.println("Error al escribir");
		}
		
			
		
		
		
		// OTROS EJEMPLOS
//		int resultado = controlarDivisionEntera(10, 0);
//		System.out.println(resultado);
//		leerImprimir();

//		System.out.println("Fin del programa");
	}

}
