/*
 * 8. Escribe un programa que declare una variable A de tipo entero y asígnale un valor. A continuación 
 * muestra un mensaje indicando si A es par o impar. Utiliza el operador ternario ( ? : ) dentro de 
 * WriteLine para resolverlo.
 */

package ejercicio8;




public class Ejercicio8 {
	
	public static void parImpar() {
		
		int A = 3 ; 
		
		System.out.println(A % 2 == 0 ? "El número " + A + " es par " : "El número"  + A + " es impar");
		
	}

	public static void main(String[] args) {
		parImpar();

	}

}
