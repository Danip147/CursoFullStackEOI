/* 3. Crea 2 variables enteras con el mismo valor en la misma línea (declaración y asignación) y muestra la
* siguiente información:
* a. Si la primera variable es menor que la segunda
* b. Si son iguales
* c. Si la primera variable es mayor o igual que la segunda
* Muestra el resultado indicando si la comparación es True o False (valor del booleano). Ejemplo: 6 es menor
* que 6: False
*/

package ejercicio3;

public class Ejercicio3 {

	public static void comparacionNumeros() {
		int num1 = 15;
		int num2 = 15;

		System.out.println(num1 + " es menor que " + num2 + ": " + (num1 < num2));
		System.out.println(num1 + " es igual que " + num2 + ": " + (num1 == num2));
		System.out.println(num1 + " es mayor o igual que " + num2 + ": " + (num1 >= num2));

	}

	public static void main(String[] args) {
		comparacionNumeros();

	}

}
