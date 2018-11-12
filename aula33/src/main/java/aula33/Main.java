package aula33;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager entityManeger = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManeger.getTransaction().begin();
		//Endereco end = new Endereco(null, "Rua Faxineiros", "232");
		//Funcionarios func = new Funcionarios(null, "Funcionario 03", end);
		//entityManeger.persist(end);
		//entityManeger.persist(func);
		Funcionarios funcionario = entityManeger.find(Funcionarios.class, 1);
		System.out.println(funcionario.getId());
		System.out.println(funcionario.getNome());
		System.out.println("Mostrar dados do endereço");
		entityManeger.getTransaction().commit();
		entityManeger.close();		
		System.out.println(funcionario.getIdEndereco().getRua());
		
		JPAutil.shutdown();
		System.exit(0);
	}
}
