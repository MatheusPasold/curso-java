package aula31;

import java.util.List;

public class ContatoDAOTest {

	public static void main(String[] args) {
		Contato c1 = new Contato(null, "João da Silva", "joao@gmail.com", "33221100");
		// Contato c2 = new Contato(null, "Maria", "maria.b@gmail.com", "99778866");
		ContatoDAO dao = new ContatoDAO();
		dao.atualizar(c1);
		// dao.inserir(c2);

		List<Contato> lista = dao.buscarTodos();

		for (Contato contato : lista) {
			System.out.println(contato);
		}
	}

}
