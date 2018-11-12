package br.com.cursojava.aula38;

import java.util.List;

public class ContatoFacade {
	
	private RepositorioContato rep = new RepositorioContato();

	public Contato carregarContato(Integer id) {
		return rep.buscarPorId(id);
	}

	public List<Contato> carregarContatos() {
		return rep.buscarTodos();
	}

	public Contato novoContato() {
		return new Contato();
	}

	public boolean salvar(Contato contatoAtual) {
		return rep.salvar(contatoAtual);
	}

	public boolean removerContato(Contato contatoAtual) {
		return rep.remover(contatoAtual.getId());
	}

}
