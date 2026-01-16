package br.com.fuctura;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import br.com.fuctura.service.LivroService;

public class MenuPrincipal {

	private LineReader reader;

	public MenuPrincipal() throws Exception {
		Terminal terminal = TerminalBuilder.builder().system(true).build();
		reader = LineReaderBuilder.builder().terminal(terminal).build();
	}

	public void iniciar() {
		String opcao;

		do {
			System.out.println("\n====== 📚 SISTEMA DE BIBLIOTECA ======");
			System.out.println("1) Gerenciar Livros");
			System.out.println("2) Gerenciar Usuários");
			System.out.println("3) Registrar Empréstimo (futuro)");
			System.out.println("4) Registrar Devolução (futuro)");
			System.out.println("0) Sair");
			System.out.println("=====================================");

			opcao = reader.readLine("Selecione uma opção: ");

			switch (opcao) {
			case "1" -> menuLivros();
			case "2" -> menuUsuarios();
			case "3" -> System.out.println(">>> Empréstimo (a implementar)");
			case "4" -> System.out.println(">>> Devolução (a implementar)");
			case "0" -> System.out.println("Encerrando...");
			default -> System.out.println("Opção inválida!");
			}

		} while (!opcao.equals("0"));
	}

	private void menuLivros() {
		String opcao;

		do {
			System.out.println("\n------ MENU LIVROS ------");
			System.out.println("1) Cadastrar Livro");
			System.out.println("2) Listar Livros");
			System.out.println("3) Buscar Livro");
			System.out.println("0) Voltar");

			opcao = reader.readLine("Escolha: ");

			switch (opcao) {
			case "1" -> cadastrarLivro();
			case "2" -> System.out.println("b...");
			case "3" -> System.out.println("c...");
			case "0" -> System.out.println("Voltando...");
			default -> System.out.println("Opção inválida!");
			}

		} while (!opcao.equals("0"));
	}

	private void menuUsuarios() {
		String opcao;

		do {
			System.out.println("\n------ MENU USUÁRIOS ------");
			System.out.println("1) Cadastrar Usuário");
			System.out.println("2) Listar Usuários");
			System.out.println("0) Voltar");

			opcao = reader.readLine("Escolha: ");

			switch (opcao) {
			case "0" -> System.out.println("Voltando...");
			default -> System.out.println("Opção inválida!");
			}

		} while (!opcao.equals("0"));
	}
	
	private void cadastrarLivro() {
		String nomeLivro = reader.readLine("Digite o nome do Livro: ");
		
		LivroService service = new LivroService();
		
		
		service.cadastrar(nomeLivro);
	}
}
