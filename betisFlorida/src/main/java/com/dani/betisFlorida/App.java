package com.dani.betisFlorida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.dani.betisFlorida.entidades.RegistroUsuario;



public class App {
	
	static List<RegistroUsuario> listaUsuarios = new ArrayList<RegistroUsuario>();


	final static String URI = "jdbc:mysql://localhost:3306/betisFlorida";
	final static String USER = "root";
	final static String PASSWORD = "";
	public static Connection con;
	
	public static void rellenarLista() {
		LocalDate LocalDateTime = LocalDate.now();	
//		listaUsuarios.add(new RegistroUsuario(8,"Rafa","Baeza", "Perez", "raf606", "rafa@gmail", "987342312", "12324", LocalDateTime, null));

		listaUsuarios.add(new RegistroUsuario("Jesus","garcia", "ayus", "Danip147", "jesus@gmail", "987342312", "12324", LocalDateTime, null));
	
		
	}
	
	public static void recorrerLista() {
		listaUsuarios.forEach(e -> System.out.println(e));
	}
	
	public static void probarConexion() {
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			System.out.println("La conexión se realizó correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}
	
	public static void poblarBbdd() {
	    PreparedStatement pst;
	    String sql = "";
	    con = null;
	    
	    try {
	        con = DriverManager.getConnection(URI, USER, PASSWORD);
	        pst = con.prepareStatement("SELECT * FROM registrousuario WHERE email = ?");
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        for (RegistroUsuario listaUsuario : listaUsuarios) {
	            pst.setString(1, listaUsuario.getEmail());
	            ResultSet rs = pst.executeQuery();
	            
	            if (rs.next()) {
	                System.out.println("El usuario con email " + listaUsuario.getEmail() + " ya existe en la base de datos");
	            } else {
	                sql = "INSERT INTO registrousuario(nombre,apellido1,apellido2,nombreUsuario,email,telefono,password,fechaRegistro,fechaUltimoAcceso) VALUES('" + 
	                          listaUsuario.getNombre() + "', '" + 
	                          listaUsuario.getApellido1() + "', '" + 
	                          listaUsuario.getApellido2() + "', '" + 
	                          listaUsuario.getNombreUsuario() + "', '" + 
	                          listaUsuario.getEmail() + "', '" + 
	                          listaUsuario.getTelefono() + "', '" + 
	                          listaUsuario.getPassword() + "', " + 
	                          "NOW()" + ", " + 
	                          listaUsuario.getFechaUltimoAcceso() + ")";

	                Statement st = con.createStatement();
	                st.executeUpdate(sql);
	                System.out.println("Usuario agregado correctamente");
	                // System.out.println(sql);

	                st.close();
	            }
	        }
	        
	        con.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Fallo en la conexión");
	    }
	}
	
	
    public static void main( String[] args ){
    	
    	rellenarLista();
//    	recorrerLista();
    	poblarBbdd();
    	
    	
  
    	
       
    }
}
