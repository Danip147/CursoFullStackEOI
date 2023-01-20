/**
 * 27. Pide al usuario un ancho y un alto y dibuja un rectángulo vacío.
 * Dime un ancho: 5
 * Dime un alto: 4
 * *****
 * *   *
 * *   *
 * *****
 */

package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {
	
	public static void ejercicio27() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un ancho: "); 
		int ancho = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un alto: "); 
		int alto = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= alto ; i++) {
			for (int j = 1; j <= ancho; j++) {
				if(i == 1 || i == alto || j == ancho || j == 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
		
		sc.close();
		
		
	}

	public static void main(String[] args) {
		ejercicio27();

	}

}
