package br.com.cursojava.aula29;

import java.util.List;

public class ContatoDAOTest {

	public static void main(String[] args) {
		ContatoDAO con = new ContatoDAO();
		List<Contato> lista = con.buscarTodos();
		for(Contato contato : lista) {
			System.out.println(contato);
		}
		lista = con.buscarPorNome("");
	}
}
