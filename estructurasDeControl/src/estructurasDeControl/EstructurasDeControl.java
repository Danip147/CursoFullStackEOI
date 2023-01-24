package estructurasDeControl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class EstructurasDeControl {

	public static void ejemploIf() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Dani")) {
			System.out.println("Hola Dani");
		}

		System.out.println("Pasa un buen dia!");

		sc.close(); // cerrar el Scanner
	}

	public static void ejemploIfElse() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Dani")) {
			System.out.println("Hola Dani");
			System.out.println("Encantado de verte de nuevo");
		} else {
			System.out.println("Hola persona desconocida");
			System.out.println("Espero verte habitualmente por aquí");
		}

		System.out.println("Pasa un buen dia!");

		sc.close();
	}

	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido: ");
		int numeroDado = sc.nextInt();

		if (numeroDado == 1) {
			System.out.println("Ha salido un uno");
		} else if (numeroDado == 2) {
			System.out.println("Ha salido un dos");
		} else if (numeroDado == 3) {
			System.out.println("Ha salido un tres");
		} else if (numeroDado == 4) {
			System.out.println("Ha salido un cuatro");
		} else if (numeroDado == 5) {
			System.out.println("Ha salido un cinco");
		} else if (numeroDado == 6) {
			System.out.println("Ha salido un seis");
		} else {
			System.out.println("¿Qué tipo de dato tienes que puede salir diferente de 1-6?");
		}

		sc.close();

	}

	public static void ifElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu equipo favorito ");
		String equipo = sc.nextLine();

		if (equipo.toLowerCase().equals("barcelona")) { // pasa a minuscula y compara
			System.out.println("Visca el Barsa!");
		} else if (equipo.toUpperCase().equals("MADRID")) { // pasa a mayuscula y compara
			System.out.println("Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) { // compara sin tener en cuenta mayusculas ni minusculas
			System.out.println("Aupa Atletic!");
		}

		// Sin poner el else final
		System.out.println("Bienvenido a nuestro programa de futbol");

		sc.close();
	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido: ");
		int numeroDado = sc.nextInt();

		switch (numeroDado) {
		case 1:
			System.out.println("Ha salido un uno");
			break;
		case 2:
			System.out.println("Ha salido un dos");
			break;
		case 3:
			System.out.println("Ha salido un tres");
			break;
		case 4:
			System.out.println("Ha salido un cuatro");
			break;
		case 5:
			System.out.println("Ha salido un cinco");
			break;
		case 6:
			System.out.println("Ha salido un seis");
			break;

		default:
			System.out.println("¿Qué tipo de dato tienes tu?");
		}

		sc.close();

	}

	public static void ejemploTernarias() {
		int edad = 15;
		/*
		 * if(edad>=18) { System.out.println("Eres mayor de edad"); }else {
		 * System.out.println("Eres menor de edad"); }
		 */

		System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

		int descuento = edad >= 18 ? 5 : 20;
		System.out.println(descuento);

		int euros = 1;
		System.out.println("Cuesta " + euros + " euro" + (euros != 1 ? "s" : ""));
		System.out.println("Cuesta " + euros + (euros != 1 ? " euros " : " euro "));
	}

	public static void ejemploAmbito() {
		int numero = 5;
		int edad = 20;

		if (edad > 18) {
			// int numero = 3; // en JAVA da error
			int valor = 4;
			System.out.println(numero);
		}
		// System.out.println(valor); // Da error porque la variable no existe fuera del
		// if

	}

	/**
	 * Este programa se ejecuta hasta que el usuario adivine la contraseña
	 */
	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in);

		String password = "1234";
		boolean adivina = false;
		while (!adivina) { // (adivina == false)
			System.out.println("Introduce la contraseña: ");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste\nSigue intentandolo");
			}
		}
		System.out.println("Contraseña correcta!");
		sc.close();

	}

	/**
	 * El programa permite advinar la password en 3 oportunidades
	 */
	public static void ejemploWhile2() {
		Scanner sc = new Scanner(System.in);

		String password = "1234";
		boolean adivina = false;
		int intentos = 0;
		while (!adivina && intentos < 3) { // (adivina == false)
			System.out.println("Introduce la contraseña (Tienes " + (3 - intentos) + " intento"
					+ (intentos != 2 ? "s" : "") + "):");
			String respuesta = sc.nextLine();
			intentos++;
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
		}

		System.out.println(adivina ? "Acertaste la contraseña" : "Gastaste todos los intentos");

		/*
		 * if (adivina) { //(adivina == true) System.out.println("Contraseña correcta");
		 * }else { System.out.println("Gastaste todos los intentos"); }
		 */

		sc.close();

	}

	public static void ejemploDoWhile1() {
		Scanner sc = new Scanner(System.in);

		String password = "1234";
		boolean adivina = false;
		int intentos = 0;
		do {
			System.out.println("Introduce la contraseña (Tienes " + (3 - intentos) + " intento"
					+ (intentos != 2 ? "s" : "") + "):");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
			intentos++;
		} while (!adivina && intentos < 3);

		System.out.println(adivina ? "Acertaste la contraseña" : "Gastaste todos los intentos");

		sc.close();

	}

	public static void acaboCurso() {
		int diasQuedan = 0; // contador
		LocalDate fecha = LocalDate.now(); // dia de hoy (23/01/2023)
		while (fecha.isBefore(LocalDate.parse("2023-03-31"))) {
			if (fecha.getDayOfWeek() != DayOfWeek.SATURDAY && fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
				System.out.println(fecha);
				diasQuedan++; // dias de clase No hasta mazto
			}
			fecha = fecha.plusDays(1); // fecha es igual a fecha + 1
		}
		System.out.println("Te quedan " + diasQuedan + " días");

	}

	/**
	 * Ejemplo de menú
	 */

	public static void ejemploDoWhile2() {

		Scanner sc = new Scanner(System.in);
		int opcion = -1; // le damos una opcion no aparazca en el menu

		do {
			// Impresion de menu
			System.out.println("1. Primera opción");
			System.out.println("2. Segunda opción");
			System.out.println("3. Tercera opción");
			System.out.println("4. Cuarta opción");
			System.out.println("0. Salir");
			System.out.println("Seleccione opción:");
			// obtencion de la opcion
			opcion = sc.nextInt();
			sc.nextLine();
			// tratamiento de la opcion
			switch (opcion) {
			case 1 -> System.out.println("Has elegido la primera opción");
			case 2 -> System.out.println("Has elegido la segunda opción");
			case 3 -> System.out.println("Has elegido la tercera opción");
			case 4 -> System.out.println("Has elegido la cuarta opción");
			case 0 -> System.out.println("¡Gracias por usar nuestro programa!");
			default -> System.out.println("La opción selecionada no es correcta");
			}

		} while (opcion != 0);
		sc.close();
	}

	/**
	 * Ejemplo horas
	 */
	public static void ejemploImprimirFecha() {
		// JAVA
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime fechaHora = LocalDateTime.now();

		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(fechaHora);
	}

	public static void ejemploFor1() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Repetición número " + (i + 1));
		}

	}

	public static void ejemploFor1b() {
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("Repetición número " + (i + 1));
		}

	}

	public static void ejemploForWhile() {
		int i = 0;
		while (i < 10) {
			i++;
		}
	}

	public static void ejemploFor2() { // bucle infinito

		for (;;) {
			System.out.println();
		}

	}
	
	public static void ejemploFor3() { // for con decremento

		for (int i = 10; i > 0; i--) {
			System.out.println("Repeticion número" + i);
		}

	}
	
	public static void ejemploFor4() { // sacar números de 2 en 2

		for (int i = 0; i < 100; i = i+2) {
			System.out.println(i);
		}

	}
	
	public static void ejemploBreak() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce password:");
			String password = sc.nextLine();
			if(password.contains("kk")) {
				break; // si encuentra una palabra con kk ya no ejecuta más el bucle
			}
			
			//No se ejecuta si se ha ejecutado el continue
			System.out.println("Gracias por introducir su contraseña.");
		}
		
		sc.close();
	}
	
	public static void ejemploContinue() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce password:");
			String password = sc.nextLine();
			if(password.contains("kk")) {
				continue; // si encuentra una palabra con kk ejecuta siempre todo el bucle pero no lo que que da detras del continue en esa iteracion
			}
			
			
			System.out.println("Gracias por introducir su contraseña.");
		}
		
		sc.close();
	}
	

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// ifElseIfElse();
		// ejemploSwitch();
		// ejemploTernarias();
		// ejemploAmbito();
		// ejemploWhile1()
		// ejemploWhile2()
		// ejemploDoWhile1();
		// acaboCurso();
		// ejemploDoWhile2();
		// ejemploImprimirFecha();
		//ejemploFor1();
		//ejemploFor1b();
		ejemploContinue();
	}

}
