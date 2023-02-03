/**
 * 15. Crea una función que reciba una fecha en formato dd-mm-yyyy, conviértela a fecha
 * (LocalDate) utilizando la función subString o split para extraer el día, mes y año, o usa
 * el DateTimeFormatter, súmale 2 años, 3 meses y 5 días, y muestra la fecha resultante.
 */

package ejercicio15;

import java.time.LocalDate;

public class Ejercicio15 {
	/**
	 * Dada una fecha en formato "dd-mm-yyyy" la devuelve en LocalDate usando subString
	 * @param fechaCadena
	 * @return
	 */
	public static LocalDate convertirFechaSubString(String fechaCadena) {
		// "27-08-1994"
		String dia= fechaCadena.substring(0, 2); //27  el numero de delante donde empiezar a coger
		String mes = fechaCadena.substring(3, 5); //07
		String anyo = fechaCadena.substring(6, 10); //1994
		
		LocalDate resultado = LocalDate.of(Integer.parseInt(anyo),Integer.parseInt(mes),Integer.parseInt(dia));
		return resultado;
		
		/*return LocalDate.of(Integer.parseInt(fechaCadena.substring(6, 10)),
				Integer.parseInt(fechaCadena.substring(3, 5)),
				Integer.parseInt(fechaCadena.substring(0, 2)));*/
	}
	/**
	 * Dada una fecha en formato "dd-mm-yyyy" la devuelve en LocalDate usando Split
	 * @param fechaCadena
	 * @param separador
	 * @return
	 */
	
	public static LocalDate convertirFechaSplit(String fechaCadena, String separador) {
		String[] partes = fechaCadena.split(separador);
		return LocalDate.of(Integer.parseInt((partes[2])),
		Integer.parseInt((partes[1])),
		Integer.parseInt((partes[0])));
		
	}


	
	/**
	 * Recibe una fecha y devuelve otra fecha con los dias meses y años que le pasamos sumados
	 * @param fechainicio fecha a la que queremos sumar dias, meses y años
	 * @param dias
	 * @param meses
	 * @param anyos
	 * @return
	 */
	public static LocalDate sumarTiempos(LocalDate fechaInicio, int dias, int meses, int anyos) {
		return fechaInicio.plusYears(anyos).plusMonths(meses).plusDays(dias);
	}
	
	
	public static LocalDate ejercicio15b(String fechaCadena) {
		//Convertir el string en LocalDate
		LocalDate fecha = convertirFechaSplit(fechaCadena, "-");
		// Sumar tiempos a un LocalDate
		fecha = sumarTiempos(fecha, 5, 3, 2);
		// devolver resultado 
		return fecha;
		
	}
	
	
	
	
	
	
	public static LocalDate ejercicio15(String fechaCadena) {
		//Convertir el string en LocalDate
		// Sumar tiempos a un LocalDate
		//Devolver el resultado
		
		String[] partesDias = fechaCadena.split("-");
	    int dia = Integer.parseInt(partesDias[0]);
	    int mes = Integer.parseInt(partesDias[1]);
	    int anyo = Integer.parseInt(partesDias[2]);
	    LocalDate date = LocalDate.of(dia, mes, anyo);
	    return date.plusYears(2).plusMonths(3).plusDays(5);
		
	}

	public static void main(String[] args) {
		System.out.println(ejercicio15b("15-02-1994"));

	}

}
