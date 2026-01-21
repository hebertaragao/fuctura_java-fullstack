package br.com.fuctura.service;

import java.sql.SQLException;
import java.util.List;

import br.com.fuctura.dao.LivroDAO;
import br.com.fuctura.domain.Livro;

//Regras de negócios
public class LivroService {

	public void cadastrar(String nomeLivro) {
		
		if(nomeLivro.length() > 40) {
			throw new RuntimeException("O nome do livro nao pode ter mais de 40 caracteres");
		}
		
		LivroDAO dao = new LivroDAO();
		
		Livro livro = new Livro();
		livro.setTitulo(nomeLivro);
		
		dao.cadastrar(nomeLivro);
		
	}
	
	public List<Livro> connsultarTodos() throws SQLException{
		LivroDAO dao = new LivroDAO();
		return dao.consultarTodos();
	}

	public List<Livro> connsultarPorTitulo(String titulo) throws SQLException {
		LivroDAO dao = new LivroDAO();
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		
		return dao.consultarPorTitulo(livro);
	}

}