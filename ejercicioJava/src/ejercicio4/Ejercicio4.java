/* 
 * 4. Crea 4 variables de tipo double con los valores que quieras. A continuación muestra sus valores por
 * consola usando 4 instrucciones para imprimir por consola y sin generar ningún salto de línea (todos
 * los valores se verán en una sola línea
 * A continuación, muestra el resultado de sumar las 2 primeras variables, multiplicar el resultado
 * por la tercera y dividir por la cuarta. Pista: la suma tiene menos prioridad que la multiplicación, por lo
 * que necesitarás agrupar dicha operación entre paréntesis.
 */

package ejercicio4;

public class Ejercicio4 {

	public static void numerosDecimales() {
		double num1 = 2.36;
		double num2 = 1.78;
		double num3 = 9.24; 
		double num4 = 12.45;
		
		double resultado = (num1 + num2) * num3 / num4; 
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + " ");
		System.out.println(num4);
		System.out.println(resultado);
	
	}
	
	
	public static void main(String[] args) {
		numerosDecimales();
			
	}

}
