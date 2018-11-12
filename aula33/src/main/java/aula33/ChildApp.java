package aula33;

import java.util.List;

public class ChildApp {

	public static void main(String[] args) {
		ChildDAO dao = new ChildDAO();
		Owner owner = new Owner(1, "owner3");
		Child child = new Child(1, "child1", owner);
		child = dao.listarPorId(3);
		
		System.out.println(child);
		/*List<Child> lista = dao.listarTodos();
		
		for(Child childs : lista) {
			System.out.println(lista);
		}*/
	}
}
