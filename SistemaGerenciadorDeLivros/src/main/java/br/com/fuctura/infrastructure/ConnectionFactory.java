package br.com.fuctura.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection getConnection() {
		
		String url = "jdbc:postgresql://localhost:5432/produtos";
		String user = "postgres";
		String password = "admin";
		
		try {
			Connection c =  DriverManager.getConnection(url, user, password);
			return c;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
		
};
