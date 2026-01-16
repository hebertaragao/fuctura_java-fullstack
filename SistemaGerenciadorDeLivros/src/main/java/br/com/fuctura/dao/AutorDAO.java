package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.domain.Autor;
import br.com.fuctura.infrastructure.ConnectionFactory;

public class AutorDAO {

	// SQL
	public void cadastrar(Autor autor) {
		// insert into autor (nome) values ('Hebert');
		ConnectionFactory fabrica = new ConnectionFactory();
		
		Connection conexao = fabrica.getConnection();
		
	
		
		
	}

}
