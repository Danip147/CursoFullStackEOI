package poo1;

import java.util.Objects;

public class Coche {
	
	// 1. propiedades o atributos
	private int numeroRuedas;
	private String marca;
	private String modelo;
	private String matricula;
	private double precio;
	
	// 2. Declaramos los constructores
	
	// 2.1 Constrctor vacio. Permite crear un objeto sin datos OBLIGATORIO
		public Coche() {
			
		}

	// 2.2 Constructor con todos los parametros LO PONEMOS SIEMPRE
		
		public Coche(int numeroRuedas, String marca, String modelo, String matricula, double precio) {
		super(); // Tiene sentido si heredas, si no, ni ayuda ni molesta.
		this.setNumeroRuedas(numeroRuedas);
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.setPrecio(precio);
	}

	// 2.3 Crear mas constructores si se desean 
		
		public Coche(int numeroRuedas, String marca, String modelo, double precio) {
			super();
			this.numeroRuedas = numeroRuedas;
			this.marca = marca;
			this.modelo = modelo;
			this.precio = precio;
			this.matricula = "0000-AAA"; // PUEDO DAR VALORES POR DEFECTO
	
		}
		
	// 2b. Constructor de copia ("Optativo*"). Crea un objeto igual al que te pasan 
		
		public Coche(Coche c) {
			super();
			this.setNumeroRuedas(c.numeroRuedas);
			this.marca = c.marca;
			this.modelo = c.modelo;
			this.matricula = c.matricula;
			this.setPrecio(c.precio);
		
		}
		
		// 3. Generar Getters y Setters
		
		public int getNumeroRuedas() {
			return numeroRuedas;
		}

	
		public void setNumeroRuedas(int numeroRuedas) {
			if (numeroRuedas == 4 || numeroRuedas == 5)
				this.numeroRuedas = Math.abs(numeroRuedas); // si me ponen un numero negativo lo pasa a postivo
			else 
				this.numeroRuedas = 4;
		}	

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMatricula() {
			if(this.matricula == null) {
				
				return "Sin matricula";
			}else {
				return matricula;
			}
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			if (precio < 0) {
			this.precio = 0;
			}else {
				this.precio = precio;
			}
		}

		
		// 4.  toString te permite decidir como quieres imprimir un objeto 	
		@Override
		public String toString() {
			return "Coche [numeroRuedas=" + numeroRuedas + ", marca=" + marca + ", modelo=" + modelo + ", matricula="
					+ this.getMatricula() + ", precio=" + precio + "]";
		}

		
		
		// 5. hasCode and equals define el criterio de igualdad de dos objetos de la misma clase.
		
		@Override
		public int hashCode() {
			return Objects.hash(matricula);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Coche other = (Coche) obj;
			return Objects.equals(matricula, other.matricula);
		}

		
		
		
		
		
		
		
		
}
