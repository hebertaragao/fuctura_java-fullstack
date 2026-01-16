package br.com.fuctura.service;

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
		livro.setNome(nomeLivro);
		
		dao.cadastrar(nomeLivro);
		
	}

}
