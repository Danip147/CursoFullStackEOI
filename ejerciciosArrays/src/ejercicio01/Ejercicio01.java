/**
 * 1. Crea un array con los nombres de los meses. A continuación pide al usuario un número
 * del 1 al 12. Muéstrale el nombre del mes correspondiente sin usar estructuras
 * condicionales (es decir, a partir de los valores del array).
 */

package ejercicio01;

public class Ejercicio01 {
	
	public static void ejercicio01() {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre"};
		int numeroUsuarioMes = 1;
		
		System.out.println(meses[numeroUsuarioMes-1]);
		
	}
	public static void main(String[] args) {
		ejercicio01();

	}

}
