package funciones;

public class Ejemplos {
	
	public static void imprimirHola () {
		// public indica que la funcion es publica puede ser llamada desde otras clases (lo contrario es private)
		// static significa que es un método de clase ("nada" es non-static)
		// void signicifa que el metodo/funcion no devuelve nada (int,String,char,double,Coche,Moto..)
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
	 * Imprime un menú con las direfentes opciones que le pasas como cadenas
	 * Añade una opcion al final 0. Salir
	 * @param opciones Las cadenas que pasas como parametros
	 */
	public static void imprimirMenu(String...opciones){// pasar multiples string sin decir cuantos indefinido
		int numOpcion = 1;
		for(String opcion : opciones) {
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
	
	
	
	public static void main(String[] args) {
		String cadena = "cadena del main";
		
		imprimirHola(); // hola
		imprimirHola(); // hola
		imprimirCadena("Esto es lo que quiero imprimir");
		//imprimirCadena(5); // No podemos pasarle un tipo de dato diferente al que espera
		imprimirCadena(cadena); // cadena del main
		imprimirDosCadenas("primera cadena", "Segunda cadena");
		cadena = "otro contenido";
		imprimirCadena(cadena); // otro contenido
		imprimirSuma(15, 20);
		imprimirMenu("Guardar", "Descargar", "Copiar");
		imprimirMenu("Listar", "Borrar", "Actualizar", "Insertar"); // CRUD -> Create, Read, Update, Delete
		imprimirSuma(5,7); //12
		imprimirSuma(5); // 15
		imprimirSuma(2.5, 5.3);
		
		// con return
		int numero = devuelveSuma(7, 4); // int numero = 11
		System.out.println(numero);
		
		System.out.println(devuelveSuma(10, 15)); // Imprime 25
		
		if(devuelveSuma(4, 7) > 10){
			System.out.println("La suma es mayor que 10");
		}else {
			System.out.println("La suma no es mayor de 10");
		}
		
	}

}
