/*
 * 9. Pregúntale al usuario su nombre y muestra un mensaje saludándole con su nombre.
 */

package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void ejercicio9() {
		// Pedimos nombre al usuario
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		// Mostramos mensaje
		JOptionPane.showMessageDialog(null, "Hola " + nombre);

	}

	public static void main(String[] args) {
		ejercicio9();	}

}
