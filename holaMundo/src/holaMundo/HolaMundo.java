package holaMundo;

import java.util.Scanner;

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

	private static void ejemplosTipos1() {
		// Números enteros
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		int resta = numero2 - numero;
		double division = (double) numero2 / numero; // para que salga tienes que poner delante de alguno el double

		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La division es: " + division);
		System.out.println("La division sobre la marcha es: " + ((double) numero2 / numero));

		// Números con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;

		System.out.println("La multiplicación es: " + decimales1 * decimales2);
		System.out.println("La suma es: " + (decimales1 + decimales2));
		double sumaDecimales = numero + decimales1;
		System.out.println("Suma con decimales es: " + sumaDecimales);

		// Enteros largos

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
		System.out.println("La suma de letra A y letra B es : " + (letraA + letraB)); // 195 suma el codigo ascii
		System.out.println("La suma de letra A y letra B es : " + letraA + letraB); // concatena las letras

	}

	public static void ejemplosString() {

		String cadena1; // String cadena1 = "Dani" declaración
		cadena1 = "Dani"; // Asignación

		String cadena2 = "Hola";
		String cadena4 = cadena2 + cadena1;
		String cadena5 = cadena2 + " " + cadena1;
		String prefijo = "34";
		String telefono = "6666666";
		int num1 = 30;

		System.out.print(prefijo + "-" + telefono);
		System.out.printf("%s tiene %d años\n", cadena1, num1);
		System.out.println("Otra cosa");

	}

	public static void ejemplosBoolean() {
		//Son valores que solo pueden almacenar TRUE o FALSE
		
		boolean verdad = true;
		boolean falso = false;
		
		System.out.println(12 > 20); // false
		System.out.println(12 < 20); // true
		// Condiciones comparación <,>,<=,>=, ==, !=, <> 
		
		int num1 = 10;
		int num2 = 30;
		boolean c1 = 10<20; //true
		boolean c2 = 10>20; //false
		boolean c3 = 10<=20; //true
		boolean c4 = 10>=20; //false
		boolean c5 = 10==20; //false
		boolean c6 = 10!=20; //true
		
		//Comparando cadenas 
		String cadena1 = "hola";
		String cadena2 = "adiós";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		
		System.out.println(cadena1.equals(cadena2)); // false
		System.out.println(cadena1.equals(cadena3)); // true
		System.out.println(cadena1.equals(cadena4)); // false 
		
		boolean cadenaIguales = cadena1.equals(cadena2); //false
		
		// comparando numeros
		int n1 = 5; 
		double n2 = 5.0;
		double n3 = 5.2;
		System.out.println(n1 == n2);// true
		System.out.println(n1 == n3);// false
		System.out.println((11/2) == n1); // true
		System.out.println((11.0/2) == n1); // true tiene que tener decimales uno de los 2
		//resto division
		System.out.println((11%2) == 1); // true
		System.out.println((11%2) == 0); // false
		
	}
	
	public static void tablasVerdad() {
		
		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		
		boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe");
		System.out.println(esPepeMayor); // true
		 
		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10) || (sexo.equals("Femenino") && 
		anyosCarnet > 5);
		System.out.println(tieneDescuento); // false
		
		boolean estoQueDa = sexo.equals("Masculino") || anyosCarnet > 5 && nombre.equals("Dani") ;
		System.out.println(estoQueDa);
	}
	
	public static void ejemplosIncrementosDecrementos() {
		int numero = 10;
		
		// pre-incremento
		++numero;
		System.out.println(numero); // 11
		//post-incremento
		numero++;
		System.out.println(numero); // 12
		
		//pre-decremento
		--numero;
		System.out.println(numero); // 11
		//post-decremento
		numero--;
		System.out.println(numero); // 10
		///LO IMPORTANTE ES EL MOMENTOS QUE INCREMENTA  O DECREMENTA
		
		System.out.println(++numero); // 11 y el número = 11
		System.out.println(numero++); // 11 y el número = 12
		System.out.println(numero); // 12
		
		System.out.println(++numero+numero++); // (13 + 13) ? 26
		System.out.println(numero); // ? 14
		
		int n2 = ++numero; // n2 = 15; numero = 15
		System.out.println("n2 = " + n2 + " numero = " + numero);
		
		int n3 = numero++; // n2 = 15; numero = 15
		System.out.println("n2 = " + n3 + " numero = " + numero);
	
	}
	
	public static void ejemplosConstantes() {

		
		
		final int IVA = 21;
		final double IVA_2= 0.21;
		double precioVaquero = 50;
		System.out.println("El precio final es: " + (precioVaquero *(1+(IVA/100.0))));
		System.out.println("El precio final es: " + (precioVaquero *(1+ IVA_2)));
		
	}
	
	public static void ejemplosConversionesNumeroCadenas() {
		int numero = 10;
		String cadena = "11";
		System.out.println(cadena+numero);
		// Convertir cadena a número
		System.out.println(Integer.parseInt(cadena)+numero);
		
		// Convertir de numero a cadena
		int prefijo = 34;
		int telefono = 6666666;
		System.out.println(prefijo+telefono); //6666666700 quita las suma
		System.out.println(""+prefijo+telefono); //3466666700
		System.out.println(String.valueOf(prefijo)+telefono); //3466666700
		System.out.println("00"+prefijo + "-" + telefono);
	}
	
	public static void ejemplosDeSaltos() {
		System.out.println("Hola\nDani\nBien?");
		System.out.println("Hola\n \tDani\nBien?");
		System.out.println("Elige una opción");
		System.out.println("\t1) Añadir producto");
		System.out.println("\t2) Borrar producto");

	}

	public static void ejemplosFormateos() {
		String dani = "Dani";
		String gabi = "Gabi";
		double salario1 = 95567.89;
		double salario2 = 2589.6347;
		
		System.out.printf("%12s%14s\n","NOMBRE", "SALARIO");//los numeros son los huecos
		System.out.println("--------------------------------");
		System.out.printf("%12s%14.2f€\n", dani,salario1); // el .2 es para los numeros de decimales a mostrar
		System.out.printf("%12s%14.2f€\n", gabi,salario2);
		
	}
	
	public static void ejemplosScanner() { //leer de la consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce su nombre: ");
		String nombre = sc.nextLine(); //En nombre se almacena
		System.out.println("Introduce su localidad: ");
		String localidad = sc.nextLine();
		System.out.println("Introduce su salario");
		double salario = sc.nextDouble();
		sc.nextLine(); // limpiar el buffer
		System.out.println("Introduzca cuanto desearia ganar");
		double salarioDeseado = sc.nextDouble();
		sc.nextLine(); // limpiar el buffer
		System.out.println("Hola " + nombre + " me encanta " 
		+localidad + " y que usted gane " +  salario+ " y que quiera ganar " + salarioDeseado);
		
		sc.close();
		
	}
	
	public static void ejemplosScanner2() { //leer de la consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce su nombre: ");
		String nombre = sc.nextLine(); //En nombre se almacena
		System.out.println("Introduce su localidad: ");
		String localidad = sc.nextLine();
		System.out.println("Introduce su salario");
		double salario = sc.nextDouble();
		sc.nextLine(); // limpiar el buffer
		System.out.println("Introduzca cuanto desearia ganar");
		double salarioDeseado = sc.nextDouble();
		sc.nextLine(); // limpiar el buffer
		System.out.println("Hola " + nombre + " me encanta " 
		+localidad + " y que usted gane " +  salario+ " y que quiera ganar " + salarioDeseado);
		
		sc.close();
		
	}
	
	
	public static void main(String[] args) {
		//ejemplosComentarios();
		//ejemplosTipos1();
		//ejemplosString();
		//ejemplosBoolean();
		//tablasVerdad();
		//ejemplosIncrementosDecrementos();
		//ejemplosConstantes();
		//ejemplosConversionesNumeroCadenas();
		//ejemplosDeSaltos();
		//ejemplosFormateos();
		//ejemplosScanner();
		ejemplosScanner2();
	}

}
