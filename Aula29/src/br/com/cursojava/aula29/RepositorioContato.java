package br.com.cursojava.aula29;

import java.util.List;

public interface RepositorioContato {

	public abstract List<Contato> buscarTodos();
	public abstract List<Contato> buscarPorNome(String nome);
	public abstract Contato buscarPorTelefone(String telefone);
	public abstract Contato buscarPorId(Integer id);
	public abstract void inserir(Contato contato);
	public abstract void atualizar(Contato contato);
	public abstract void remover(Integer id);
	public abstract int contar(Contato contato);
	
}
