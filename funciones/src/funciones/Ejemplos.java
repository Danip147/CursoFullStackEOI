package funciones;

import java.util.Arrays;

public class Ejemplos {

	public static void imprimirHola() {
		// public indica que la funcion es publica puede ser llamada desde otras clases
		// (lo contrario es private)
		// static significa que es un método de clase ("nada" es non-static)
		// void signicifa que el metodo/funcion no devuelve nada
		// (int,String,char,double,Coche,Moto..)
		System.out.println("Hola");
	}

	public static void imprimirCadena(String cadena) { // parametro de entrada
		System.out.println(cadena);
	}

	public static void imprimirDosCadenas(String cadena, String cadena2) {
		System.out.println(cadena + " " + cadena2);
	}

	// SOBRECARGAR METODOS ////////////////////////////////////
	// el metodo se llama igual pero se le pasan distintos parametros

	public static void imprimirSuma(int numero1, int numero2) {
		System.out.println(numero1 + numero2);
	}

	public static void imprimirSuma(double numero1, double numero2) {
		System.out.println(numero1 + numero2);
	}

	public static void imprimirSuma(int numero1) {
		System.out.println(numero1 + 10);
	}

	public static void imprimirSuma(String numero1, String numero2) {
		System.out.println(Integer.parseInt(numero1) + Integer.parseInt(numero2));
	}

	//////////////////////////////////////////////////////////////////

	/**
	 * Imprime un menú con las direfentes opciones que le pasas como cadenas Añade
	 * una opcion al final 0. Salir
	 * 
	 * @param opciones Las cadenas que pasas como parametros
	 */
	public static void imprimirMenu(String... opciones) {// pasar multiples string sin decir cuantos indefinido
		int numOpcion = 1;
		for (String opcion : opciones) {
			System.out.println(numOpcion + " . " + opcion);
			numOpcion++;
		}
		System.out.println("0 . Salir");
	}

	// Métodos que devuelven algo

	public static int devuelveSuma(int numero1, int numero2) {
		int resultado = 0;
		resultado = numero1 + numero2;
		return resultado;
	}

	public static void parametrosValor(int numero, int numero2) {
		numero++;
		numero2++;
	}

	public static void parametrosReferencia(int[] valores) {
		valores[0]++;
		
	}
	
	public static void ejemplosMath() {
		double n1 = -23.40;
		double n2 = 2.404567;
		
		System.out.println(Math.abs(n1)); // 23.4
		System.out.println(Math.round(n2)); // 2
		System.out.println(Math.round(n1)); // -23
		System.out.println(Math.ceil(n2)); // -3 redonde hacia arriba
		System.out.println(Math.ceil(n1)); // -23
		System.out.println(Math.floor(n2)); // -2 redondea hacia abajo siempre
		System.out.println(Math.floor(n1)); // -24
		
		System.out.println(Math.max(23, 43)); // 43
		System.out.println(Math.min(4, 5)); // 4
		System.out.println(Math.sqrt(25)); // 5
		System.out.println(Math.pow(3, 2)); // 9 Eleva 
		System.out.println(Math.pow(3, 3)); // 27 Eleva 
	}
	
	public static void ejemplosString() {
		String s1 = "abc";
		String s2 = "def";
		String s3 = "ghi";
		String concatenada = s1.concat(s2).concat(s3);
		String concatenada2 = s1+s2+s3;
		System.out.println(concatenada); // abcdefghi
		
	}
	
	

	public static void main(String[] args) {
		String cadena = "cadena del main";

		imprimirHola(); // hola
		imprimirHola(); // hola
		imprimirCadena("Esto es lo que quiero imprimir");
		// imprimirCadena(5); // No podemos pasarle un tipo de dato diferente al que
		// espera
		imprimirCadena(cadena); // cadena del main
		imprimirDosCadenas("primera cadena", "Segunda cadena");
		cadena = "otro contenido";
		imprimirCadena(cadena); // otro contenido
		imprimirSuma(15, 20);
		imprimirMenu("Guardar", "Descargar", "Copiar");
		imprimirMenu("Listar", "Borrar", "Actualizar", "Insertar"); // CRUD -> Create, Read, Update, Delete
		imprimirSuma(5, 7); // 12
		imprimirSuma(5); // 15
		imprimirSuma(2.5, 5.3);

		// con return
		int numero = devuelveSuma(7, 4); // int numero = 11
		System.out.println(numero);

		System.out.println(devuelveSuma(10, 15)); // Imprime 25

		if (devuelveSuma(4, 7) > 10) {
			System.out.println("La suma es mayor que 10");
		} else {
			System.out.println("La suma no es mayor de 10");
		}

		int var1 = 5;
		int var2 = 10;
		parametrosValor(var1, var2);
		System.out.println("Var1: " + var1 + " Var2: " + var2); // 6 y 11 - 5 y 10? => 5 y 10

		int[] var1ref = { var1 }; // {5}
		parametrosReferencia(var1ref); // {6}
		System.out.println(var1ref[0]); // 6
		
		ejemplosMath();
	}

}
