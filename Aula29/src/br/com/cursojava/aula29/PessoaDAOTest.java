package br.com.cursojava.aula29;

import java.util.List;

public class PessoaDAOTest {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		/*List<Pessoa> listaPessoas = dao.buscarTodos();
		for(Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}*/
		
		System.out.println("Inserindo novo registro...");
		/*Pessoa tib = new Pessoa(null, "Tibúrcio");
		dao.inserir(tib);
		System.out.println(tib);*/
		Pessoa pessoa = dao.buscarPorId(9);
		System.out.println(pessoa);
		pessoa.setNome("Tibúrcio da Silva");
		dao.atualizar(pessoa);
		System.out.println(dao.buscarPorId(9));
		
		dao.remover(9);
		System.out.println(dao.buscarPorId(9));
	}
}
