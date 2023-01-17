/* 2. Crea un programa con 2 variables de tipo entero con los valores 15 y 4. Para estos valores calcula la
* suma, la resta, la multiplicación, la división y el resto. Ten en cuenta que al ser 2 números enteros, el
* resultado de la división también será entero. Muestra por pantalla los resultados de esta manera:
* 15 + 4 = 19
* 15 – 4 = 11
* 15 / 4 = 3
* 15 * 4 = 60
* 15 % 4 = 3
*/

package ejercicio2;

public class Ejercicio2 {

	public static void calculos() {

		int num1 = 15;
		int num2 = 4;

		int suma = num1 + num2;
		int resta = num1 - num2;
		int division = num1 / num2;
		int multiplicacion = num1 * num2;
		int resto = num1 % num2;

		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + resta);
		System.out.println(num1 + " / " + num2 + " = " + division);
		System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
		System.out.println(num1 + " % " + num2 + " = " + resto);

	}

	public static void main(String[] args) {
		calculos();

	}

}
