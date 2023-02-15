package otroJercicioPoo;

public class App {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Empleado daniel = new Empleado("Daniel", 1200); 				// Puedo crear el empleado y luego añadirlo
		empresa.getEmpleados().add(daniel);	
		
		empresa.getEmpleados().add(new Empleado("Fran", 15000)); 		// O añadir directamente
		empresa.getEmpleados().add(new Empleado("Manolo", 20000)); 		// Creo empleado sobre la marcha

		Empresa copia = new Empresa(empresa); 							// Copiar una empresa a partir de otra
		copia.getEmpleados().get(0).setNombre("Paco"); 					// Cambio el nombre al primer empleado
		copia.getDireccion().setNumeroCalle(10); 						// Cambiar el numero de la calle de la direccion de la empresa copia
		
		copia.getEmpleados().add(new Empleado("Gabriel", 30000));		// Añado un nuevo empleado en la copia
		
		
		// Mostramos los valores de la empresa original y de la copia
		
		System.out.println("Empresa original: ");
		System.out.println(empresa);
		System.out.println("Empresa copia: ");
		System.out.println(copia);
		System.out.println("La empresa original tiene: " + empresa.getEmpleados().size());			// Ver el tamaño de la lista
		System.out.println("La empresa copia tiene: " + empresa.getEmpleados().size());
		
		
		
	}
	

}
