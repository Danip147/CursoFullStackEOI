/**
 * 11. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula 
 * correspondiente para pasar de grados centígrados a fahrenheit es:
 * F = 32 + ( 9 * C / 5)
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de grados: "); 
		double grados = sc.nextDouble();
		
		System.out.println(grados + "Cº en Fahrenheit es: " + (32+(9*grados/5) +"ºF"));
		
		sc.close();
	}
	
	public static void main(String[] args) {
		ejercicio11();

	}

}
