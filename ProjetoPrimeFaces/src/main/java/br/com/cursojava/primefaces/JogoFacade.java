package br.com.cursojava.primefaces;

import java.util.List;

public class JogoFacade {

	private JogoRepositorio rep = new JogoRepositorio();

	public Jogo novoJogo() {
		return new Jogo();
	}

	public List<Jogo> carregarContatos() {
		return rep.buscarTodos();
	}

	public boolean salvar(Jogo jogo) {
		return rep.salvar(jogo);
	}

	public boolean removerJogo(Jogo jogo) {
		return rep.remover(jogo.getId());
	}
}
