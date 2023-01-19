/*
 * 4. Programa que le pida 2 cadenas de texto al usuario y compruebe si son iguales
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void pideCadenas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de texto:");
		String cadena1 = sc.nextLine();
		
		System.out.println("Introduzca una segunda cadena de texto:");
		String cadena2 = sc.nextLine();
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Las cadenas son diferentes");
		}
			
		sc.close();
		
	}

	public static void main(String[] args) {
		pideCadenas();
		
	}

}
