package holaMundo;

/**
 * Esta es la clase inicial del curso
 * 
 * @author Dani
 * @since 1.0
 *
 */
public class HolaMundo {

	public static void ejemplosComentarios() {
		/*
		 * Este es mi primer programa Daniel 17/01/2023
		 */

		// System.out.println("Hola Mundo!");
		System.out.println("Hola Dani");

		/*
		 * System.out.println("Hola Dani"); System.out.println("Hola Dani");
		 */

	}

	private static void ejemplosTipos() {
		// Números enteros
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		int resta = numero2 - numero;
		double division = (double)numero2/numero; //para que salga tienes que poner delante de alguno el double
		 
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La division es: " + division);
		System.out.println("La division sobre la marcha es: " + ((double)numero2/numero));
		
		// Números con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		
		System.out.println("La multiplicación es: " + decimales1 * decimales2);
		System.out.println("La suma es: " + (decimales1 + decimales2));
		double sumaDecimales = numero + decimales1;
		System.out.println("Suma con decimales es: " + sumaDecimales);
		
		//Enteros largos
		
		int largo1 = 2000000000;
		int largo2 = 100000000;
		System.out.println("La suma de dos largos es: " + (largo1 + largo2));
		
		// Me he pasado del máximo para usar int
		int maxInt = Integer.MAX_VALUE; // El maximo value es 2147483647
		int minInt = Integer.MIN_VALUE; // El mínimo value es -2147483648
		
		int largo3 = 2000000000;
		int largo4 = 200000000;
		System.out.println("La suma de dos largos es: " + (largo3 + largo4));
		
		System.out.println(maxInt);
		
		long largo5 = 2000000000; 
		long largo6 = 1000000000;
		System.out.println("La suma de dos largos correctamente es: " + (largo5 + largo6));
		
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("La suma de letra A y letra B es : " +(letraA+letraB)); // 195 suma el codigo ascii
		System.out.println("La suma de letra A y letra B es : " + letraA+letraB ); // concatena las letras
		
	}

	public static void main(String[] args) {
		// ejemplosComentarios();
		ejemplosTipos();

	}

}
