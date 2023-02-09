package ejercicio04;

public class Main {
	 public static void main(String[] args) {
	        Equipo equipo = new Equipo();
	        equipo.setNombre("Betis Florida");
	        
	        equipo.addJugador(new Jugador("Daniel", 1000));
	        equipo.addJugador(new Jugador("Fran", 2000));
	        equipo.addJugador(new Jugador("Jesus", 1500));
	        equipo.addJugador(new Jugador("Paco", 2500));

//	        equipo.deleteJugador(0);

	        System.out.println("El nombre del equipo es: " + equipo);
	        for (int i = 0; i < equipo.getNumJugadores(); i++) {
	            Jugador jugador = equipo.getJugador(i);
	            System.out.println("Nombre: " + jugador.getNombre() + " Sueldo: " + jugador.getSueldo());
	        }

	        System.out.println("Total sueldos: " + equipo.totalSueldos());
	    }
	
	
}




	


