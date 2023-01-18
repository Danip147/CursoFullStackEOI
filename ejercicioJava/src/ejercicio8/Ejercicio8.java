/*
 * 8. ¿Cuál sería el resultado de las siguientes operaciones? a=5; b=++a; c=a++; b=b*5; a=a*2; 
 * Calcúlalo a mano y luego crea un programa que lo resuelva, para ver si habías hallado la 
 * solución correcta
 */

package ejercicio8;

public class Ejercicio8 {
	
	public static void ejercicio8() {
		int a, b, c;
		
		a = 5 ; 
		System.out.println(a);
		b = ++a;
		System.out.println(b);
		c= a++;
		System.out.println(c);
		b= b*5;
		System.out.println(b);
		a = a*2;
		System.out.println(a);
		
		}

	public static void main(String[] args) {
		ejercicio8();
	}

}
