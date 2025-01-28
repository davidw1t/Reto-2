package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionViajesBD {
	
	private Connection conexion;
	
	public GestionViajesBD() {
		iniciarConexion();
	}

	private boolean iniciarConexion() {
		// TODO Auto-generated method stub
		boolean conexioHecha = false;
		System.out.println("Conectando...");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/gestor_de_eventos", "root", "");
			conexioHecha = true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado la libreria");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encontro la base de datos");
			e.printStackTrace();
		}
		
		System.out.println("Conectado");
		return conexioHecha;
	}
	
	public boolean cerrarConexion() {
		boolean conexionCerrada = false;
		System.out.println("Cerrando...");
		try {
			if (!conexion.isClosed()) {
				conexion.close();
				conexionCerrada = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Conexion cerrada");
			return conexionCerrada;
		}

}
