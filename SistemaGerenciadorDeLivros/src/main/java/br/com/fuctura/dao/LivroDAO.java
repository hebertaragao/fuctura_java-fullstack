package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fuctura.domain.Livro;
import br.com.fuctura.infrastructure.ConnectionFactory;

public class LivroDAO {

	public List<Livro> consultarTodos() throws SQLException {
		ConnectionFactory fabrica = new ConnectionFactory();
		Connection conexao = fabrica.getConnection();
		String comandoSQL = "select * from livro";
		PreparedStatement pstm = conexao.prepareStatement(comandoSQL);
		ResultSet rs = pstm.executeQuery();

		List<Livro> resultadoConsulta = new ArrayList<Livro>();

		while (rs.next()) {
			int id = rs.getInt("id");
			String titulo = rs.getString("titulo");
			Livro livro = new Livro();
			livro.setTitulo(titulo);
			livro.setId(id);

			resultadoConsulta.add(livro);

		}

		return resultadoConsulta;

	}

	public Livro consultarPorId(Livro livro) {
		return null;
	}

	public void atualizar(Livro livro0) {

	}

	public void excluir(Livro livro) {
	}

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

	public List<Livro> consultarPorTitulo(Livro livro) throws SQLException {
		ConnectionFactory fabrica = new ConnectionFactory();
		Connection conexao = fabrica.getConnection();
		String comandoSQL = "select * from livro where titulo like ?";
		PreparedStatement stm = conexao.prepareStatement(comandoSQL);
		stm.setString(1, livro.getTitulo() + "%");
		ResultSet rs = stm.executeQuery();
		
		List<Livro> resultadoConsulta = new ArrayList<Livro>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String titulo = rs.getString("titulo");
			
			Livro livros = new Livro();
			livros.setId(id);
			livros.setTitulo(titulo);
			resultadoConsulta.add(livros);
		}
		return resultadoConsulta;
			
	}

}