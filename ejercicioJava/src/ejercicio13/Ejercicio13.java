/*
 * 13. Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su 
 * número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la fecha de 
 * nacimiento y a continuación sumando las cifras obtenidas en la suma. 
 * Por ejemplo: 
 * Si la fecha de nacimiento es 12/07/1980 Calculamos el número de la suerte así:
 * 12+7+1980 = 1999 1+9+9+9 = 28 
 * Número de la suerte: 28
 *
 */


package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void numeroSuerte() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca día de nacimineto: "); //9
		int diaNacimiento = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca mes de nacimineto: "); //4
		int mesNacimiento = sc.nextInt();
		sc.nextLine();	
		System.out.println("Introduzca anyo de nacimineto: "); // 1994
		int anyoNacimiento = sc.nextInt();
		sc.nextLine();	
		
		int numeroSuerte = diaNacimiento+mesNacimiento+anyoNacimiento; //2007
		
		int suma = 0;
        while (numeroSuerte > 0) {
            suma += numeroSuerte % 10;
            numeroSuerte /= 10;
        }
		
		
		System.out.println("Tú número de la suerte es el : " +suma);
					
	}

	public static void main(String[] args) {
		numeroSuerte();

	}

}
