/*
 * 7. Programa que pida al usuario una cantidad de horas, de minutos y de segundos (3 números diferentes).
 *    Comprueba que la hora está en el rango de 0 a 23, los minutos y los segundos de 0 a 59. 
 *    
 *   Si todo es correcto, muestra al usuario la hora en formato HH:MM:SS (2 cifras para cada parte 
 *   rellenando con 0 a la izquierda si es una cifra), y si no, muestra un mensaje de error. Pista: Repasa la 
 *   parte de formatear la salida de texto para números enteros
 */


package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void dimeHoras() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de horas: ");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un número de minutos: ");
		int minutos = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un número de segundos: ");
		int segundos = sc.nextInt();
		sc.nextLine();
		
		if (horas > 0 && horas <= 24) {
			if (minutos > 0 && minutos <= 59) {
				if (segundos > 0 && segundos <= 59) {
					System.out.printf("Hora introducida: %02d:%02d:%02d", horas, minutos, segundos);
				} else {
					System.out.println("Error al introducir los segundos");
				}
			} else {
				System.out.println("Error al introducir los minutos");
			}
		} else {
			System.out.println("Error al introducir las horas");
			}
		
		
	sc.close();
	}
	
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de horas: ");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un número de minutos: ");
		int minutos = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un número de segundos: ");
		int segundos = sc.nextInt();
		sc.nextLine();
		
		if(horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos <0 || segundos > 59) {
			System.out.println("valores erroneos");
		}else {
			System.out.printf("Hora introducida: %02d:%02d:%02d", horas, minutos, segundos);
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		//dimeHoras();
		ejercicio7();

	}

}
