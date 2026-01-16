package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fuctura.domain.Livro;
import br.com.fuctura.infrastructure.ConnectionFactory;

public class LivroDAO {

	public List<Livro> consultarTodos(){
		return null;
	}
	public Livro consultarPorId(Livro livro) {
		return null;
	}
	public void atualizar(Livro livro0) {
		
	}
	public void excluir (Livro livro) {}
	
	
	public void cadastrar(String nomeLivro) {
		// insert into livro (titulo) values (?);
		String comandoSQL = "insert into livro (titulo) values (?)";

		// usa try-with-resources para garantir o fechamento de recursos
		try (Connection conexao = new ConnectionFactory().getConnection();
				PreparedStatement stm = conexao.prepareStatement(comandoSQL)) {

			stm.setString(1, nomeLivro);
			stm.execute();

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao cadastrar livro", e);
		}
	}

}