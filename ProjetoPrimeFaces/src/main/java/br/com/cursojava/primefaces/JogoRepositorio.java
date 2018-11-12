package br.com.cursojava.primefaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JogoRepositorio {

	private static List<Jogo> lista = new ArrayList<>();
	private static int contador = 1;

	public List<Jogo> buscarTodos() {
		return Collections.unmodifiableList(lista);
	}

	public boolean salvar(Jogo jogo) {
		boolean resultado = false;
		if (jogo.getId() == null) {
			resultado = inserir(jogo);
		} else {
			resultado = atualizar(jogo);
		}

		return resultado;
	}

	private boolean atualizar(Jogo jogo) {
		boolean resultado = false;
		int indexOf = lista.indexOf(jogo);
		if (indexOf > -1) {
			lista.set(indexOf, jogo);
			resultado = true;
		}
		return resultado;
	}

	private boolean inserir(Jogo jogo) {
		jogo.setId(contador++);
		return lista.add(jogo);
	}

	public boolean remover(Integer id) {
		int maior = lista.size();
		lista = lista.stream().filter(jogo -> id != null && !id.equals(jogo.getId())).collect(Collectors.toList());
		return maior > lista.size();
	}

}
