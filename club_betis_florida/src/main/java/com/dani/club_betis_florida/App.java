package com.dani.club_betis_florida;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dani.club_betis_florida.entidades.Usuario;
import com.dani.club_betis_florida.utilidades.PasswordEncrypter;

public class App {

	static List<Usuario> listaUsuario = new ArrayList<Usuario>();

	final static String URI = "jdbc:mysql://localhost:3306/billar_betis_florida";
	final static String USER = "root";
	final static String PASSWORD = "";
	public static Connection con;

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
	
	public static boolean validarUsuario(String email, String password) {
	    boolean validado = false;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con = DriverManager.getConnection(URI, USER, PASSWORD);
	        String sql = "SELECT COUNT(*) FROM usuario WHERE usu_email = ? AND usu_pass = ?";
	        ps = con.prepareStatement(sql);
	        ps.setString(1, email);
	        ps.setString(2, PasswordEncrypter.encryptPassword(password));
	        rs = ps.executeQuery();
	        rs.next();
	        int count = rs.getInt(1);
	        if (count > 0) {
	            validado = true;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) {
	                rs.close();
	            }
	            if (ps != null) {
	                ps.close();
	            }
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return validado;
	}


	public static void agregarUsuarios() {

		listaUsuario.add(new Usuario("Daniel", "Porras", "Pérez", "daniel147", "daniel@gmail.com", "daniel@gmail.com","hola mundo", "hola mundo", null, null));
		listaUsuario.add(new Usuario("Gabriel", "Porras", "Pérez", "gabi1991", "gabi@gmail.com", "gabi@gmail.com","1234", "1234", null, null));
		listaUsuario.add(new Usuario("Jesus", "Ayus", "Ayus", "ayus149", "ayus@outlook.es", "ayus@outlook.es","hola", "hola", null, null));
	}

	public static void poblarBbdd() {
	    Statement st;
	    String sql = "";
	    con = null;
	    try {
	        con = DriverManager.getConnection(URI, USER, PASSWORD);
	        st = con.createStatement();

	        for (Usuario usuario : listaUsuario) {		// recorre la lista

	            if (Usuario.emailCorrecto(usuario.getUsu_email(), usuario.getEmail_rep()) // Si el email y la pass coinciden intenta hacer esto
	                    && Usuario.passCorrecto(usuario.getUsu_pass(), usuario.getPass_rep())) {
	                try {
	                    String passEncriptada = PasswordEncrypter.encryptPassword(usuario.getUsu_pass()); // Encripta la contraseña
	                    String email = usuario.getUsu_email(); //coge el email
	                    boolean usuarioExiste = false;
	                    ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM usuario WHERE usu_email='" + email + "'"); // hace la consulta SQL
	                    if (rs.next() && rs.getInt(1) > 0) {
	                        System.out.println("El usuario con email " + email + " ya existe en la base de datos");
	                        usuarioExiste = true;
	                    }
	                    rs.close();
	                    if (!usuarioExiste) {
	                        sql = "INSERT INTO usuario(usu_nombre, usu_apellido1, usu_apellido2, usu_usuario, usu_email, usu_pass, usu_fecha_registro, usu_fecha_ult_acceso) VALUES('"
	                                + usuario.getUsu_nombre() + "', '"
	                                + usuario.getUsu_apellido1() + "', '"
	                                + usuario.getUsu_apellido2() + "', '"
	                                + usuario.getUsu_usuario() + "', '"
	                                + email + "', '"
	                                + passEncriptada + "', "
	                                + usuario.getUsu_fecha_registro() + ", "
	                                + usuario.getUsu_fecha_ult_acceso() + ");";
	                        System.out.println(sql);
	                        st.executeUpdate(sql);
	                    }
	                } catch (NoSuchAlgorithmException e) {

	                    e.printStackTrace();
	                }

	            } else {
	                System.out.println("Error al registrarse, email o contraseña no son iguales");
	            }

	        }

	        st.close();
	        con.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Fallo en la conexión");
	    }
	}

	
	
	public static void main(String[] args) {

		probarConexion();
		agregarUsuarios();
		poblarBbdd();
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduzca su email: ");
	    String email = scanner.nextLine();
	    System.out.print("Introduzca su contraseña: ");
	    String password = scanner.nextLine();

	    if (validarUsuario(email, password)) {
	        System.out.println("Usuario ha entrado correctamente");
	    } else {
	        System.out.println("Usuario o contraseña incorrectos");
	    }

	}

}

