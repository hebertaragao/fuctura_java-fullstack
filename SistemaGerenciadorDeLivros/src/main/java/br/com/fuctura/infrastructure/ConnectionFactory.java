package br.com.fuctura.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection getConnection() {
		
		String url = "jdbc:postgresql://fuctura.cy9ok6ouegjq.us-east-1.rds.amazonaws.com:5432/postgres";
		String user = "aragao";
		String password = "aragao#aluno";
		
		try {
			Connection c =  DriverManager.getConnection(url, user, password);
			return c;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
		
};
