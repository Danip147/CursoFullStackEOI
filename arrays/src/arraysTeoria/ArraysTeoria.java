package arraysTeoria;

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

		// con un bucle for-each. No podemos saber la poscion
		for (int numero : numeros) {
			System.out.println(numero + 10);
		}
		
		// bucle for-each con poscion . Para hacer esto hago el bucle for 
		int i = 0;
		for (int numero : numeros) {
			System.out.println("El array numeros en su posción " + i + " tiene el valor " + numero);
			i++;
		}
		

	}

	public static void main(String[] args) {
		// ejemploDeclaraciones();
		ejemploRecorrido();

	}

}
