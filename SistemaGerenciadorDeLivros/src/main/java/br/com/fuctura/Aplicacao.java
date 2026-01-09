package br.com.fuctura;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Aplicacao {

	public static void main(String[] args) {
		
		//remoto
		String url = "jdbc:postgresql://fuctura.cy9ok6ouegjq.us-east-1.rds.amazonaws.com:5432/postgres";
		String user = "aragao";
		String password = "aragao#aluno";
		
		try {
			DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Conectado com Sucesso!");
		

	}

}
