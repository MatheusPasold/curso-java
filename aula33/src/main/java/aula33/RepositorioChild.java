package aula33;

import java.util.List;

public interface RepositorioChild {

	public abstract void incluir(Child child);
	public abstract List<Child> listarTodos();
	public abstract Child listarPorId(Integer id);
	public abstract void atualizar(Child child);
	public abstract boolean remover(Child child);
}