package arraysTeoria;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysTeoria {

	public static void ejemploDeclaraciones() {
		// Java es un lenguaje base 0, siempre la primera poscion es la 0
		// la última será el número -1

		int[] numeros; // Declarar la variable
		numeros = new int[5]; // Asignarle memoria para poder trabajar con ella

		numeros[0] = 12; // Inicializar valores
		numeros[1] = 23;
		numeros[2] = 53;
		numeros[3] = 5;
		numeros[4] = 92;

		int[] nums = new int[5]; // Declaracion y asignacion en la misma línea. Lo más habitual.
		// Si a nums no le doy valores a los numeros, todos tienen 0.

		int[] numeros2 = { 12, 23, 53, 5, 92 }; // Declarar variable y asignarle directamente valores.

	}

	public static void ejemploRecorrido() {
		int[] numeros = { 12, 23, 53, 5, 92 };

		// cuando necesito saber la poscion
		for (int i = 0; i < numeros.length; i++) { // Recorre el array de uno en uno
			System.out.println("El array numeros en su posción " + i + " tiene el valor " + numeros[i]);
		}

		// bucle for desde atrás hacia delante
		for (int i = numeros.length - 1; i > 0; i--) {
			System.out.println("El array numeros en su posción " + i + " tiene el valor " + numeros[i]);
		}

		// con un bucle for-each. No podemos saber la poscion
		for (int numero : numeros) {
			System.out.println(numero);
		}

		// bucle for-each con poscion . Para hacer esto hago el bucle for
		int i = 0;
		for (int numero : numeros) {
			System.out.println("El array numeros en su posción " + i + " tiene el valor " + numero);
			i++;
		}

	}

	public static void ejemploBusquedas1() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		boolean encontrado = false; // Nos indicará si hemos encontrado el valor
		String buscar = "Pedro"; // Valor a buscar en el array
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < nombres.length && !encontrado; i++) {
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	// Programación funcional
	public static void ejemploBusquedaFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";
		if (Arrays.stream(nombres).anyMatch(n -> n.equals(buscar))) { // con lambdas
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	public static void ejemploRedimension() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };

		nombres = Arrays.copyOf(nombres, 10);
		nombres[5] = "Marta";
		System.out.println(nombres.length); // 10
		System.out.println(String.join(", ", nombres)); // Juan, Ana, Pedro, Eva, Paco, Marta, null, null, null, null
	}

	public static void ejemploAumentarUnoArray() {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		System.out.println("Introduzca en nuevo alumno: ");
		String nombreAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length + 1); // le da un tamaña de una unidad más al array

		alumnos[alumnos.length - 1] = nombreAlumno; // Mete el nuevo dato en la ultima posicion

		for (String alumno : alumnos) { // con for-each
			System.out.println(alumno);
		}

		// Programacion funcional
		Arrays.stream(alumnos).forEach(e -> System.out.println(e)); // e de elemento
		sc.close();

	}

	// Eliminar por el final
	public static void ejemploEliminarElementoArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		alumnos = Arrays.copyOf(alumnos, alumnos.length - 1);
		for (String alumno : alumnos) { // con for-each
			System.out.println(alumno);
		}

	}

	public static void ejemploOrdenarArray() {
		// ordena lexicamente (primero las mayusculas...)
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		Arrays.sort(alumnos);
		System.out.println("Imprimir con for-each");
		for (String alumno : alumnos) { // con for-each accedes a cada elemento
			System.out.println(alumno);
		}

		System.out.println("Imprimir con toString");
		System.out.println(Arrays.toString(alumnos)); // te muestra el contenido del array SOLO PARA VER

		// ordenando números
		int[] numeros = { 11, 2, 67, 4, 20, 45 };
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

	public static void ejemploOrdenarInverso() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		Arrays.sort(alumnos); // orden menor a mayor
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		// orden de mayor a menor
		Collections.reverse(Arrays.asList(alumnos));
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}

		// ordenando números
		Integer[] numeros = { 11, 2, 67, 4, 20, 45 }; // Integer es la clase Wrapper de int, Boxing
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}

		// orden de mayor a menor
		Collections.reverse(Arrays.asList(numeros));
		for (int numero : numeros) {
			System.out.println(numero);
		}
		

	}

	public static void clasesEnvolventes() { // Wrappers 
		// int -> Integer
		Integer numero;
		//double -> Double
		Double decimal;
		//float -> Float
		Float decimal2;
		//char -> Character
		Character letra;
		// boolean -> Boolean
		Boolean booblean;
		// String ya es una calse no tiene Wrapper
		String cadena = "hola";
		
	}
	
	
	public static void main(String[] args) {
		// ejemploDeclaraciones();
		// ejemploRecorrido();
		// ejemploBusquedas1();
		// ejemploBusquedaFuncional();
		// ejemploRedimension();
		// ejemploAumentarUnoArray();
		// ejemploEliminarElementoArray();
		// ejemploOrdenarArray();
		ejemploOrdenarInverso();
	}

}
