package estructurasDeControl;

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

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// ifElseIfElse();
		ejemploSwitch();
	}

}
