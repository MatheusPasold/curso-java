package br.com.cursojava.aula13;

import java.util.ArrayList;

public class ContatoController {

	private ContatoRepositorio repositorio = new ContatoRepositorio();

	public boolean adicionarContato(String nome, String email, String telefone, String codigo) {
		Contato contato = new Contato(null, nome, codigo,email, telefone);
		return repositorio.adicionarContato(contato);
	}

	public boolean isNomeValido(String nome) {
		boolean valido = nome !=null && !"".equals(nome.trim()) && nome.length() >=3;
		return valido;
	}

	public ArrayList<Contato> buscarTodos() {		
		return repositorio.buscarTodos();
	}

	public ArrayList<Contato> filtrarPorNome(String nome) {
		
		ArrayList<Contato> todos = buscarTodos();
		ArrayList<Contato> lista = new ArrayList<>();
		for (Contato contato : todos) {
			if(contato != null && contato.getNome() != null && contato.getNome().startsWith(nome)){
				lista.add(contato);
			}
		}
		return lista;
	}

}