/*
 * 9. Programa que lea una variable entera llamada mes y compruebe con una estructura switch, 
 * si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 
 * días. Se mostrará además de los días, el nombre del mes. Se mostrará un error cuando el mes 
 * no sea válido.
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void dimeMes() {
		// Meses con 30 dias: abril , Junio, Septiembre, Noviembre
		// Meses con 31 dias: enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
		// Meses con 28 dias: Febrero

		int mes = 3;

		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 días");
			break;

		case 2:
			System.out.println("Febrero tiene 28 días");
			break;

		case 3:
			System.out.println("Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("Abril tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("Junio tiene 30 días");
			break;
		case 7:
			System.out.println("Julio tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días");
			break;

		default:
			System.out.println("Mes introducido incorrecto");
			break;

		}

	}

	public static void dimeMes2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número del mes");
		int numeroMes = sc.nextInt();
		
		switch(numeroMes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10: 
		case 12:
			System.out.println("El mes tiene 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tien 30 días");
			break;
		case 2: 
			System.out.println("El mes tiene 28 días");
			break;
		default:
			System.out.println("El número de mes introducido no es correcto");
			break;
		}
		
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//dimeMes();
		dimeMes2();

	}

}
