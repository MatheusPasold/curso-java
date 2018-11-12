package aula31;

import java.math.BigInteger;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		
		Pessoa ana = new Pessoa (7, "Ana Maria da Silva");
		entityManager.getTransaction().begin();
		Pessoa anaSicronizada = entityManager.merge(ana); //atualizar ana
		
		Pessoa p = entityManager.find(Pessoa.class, 14); //procurar 
		System.out.println(p.getId());
		System.out.println(p.getNome());
		p.setNome("Tibúrcio Brasil");
		
		
		String sql = "select count(*) from pessoas";
		BigInteger result = (BigInteger) entityManager.createNativeQuery(sql).getSingleResult();
		
		System.out.println(result.intValue());
		System.out.println(p.getId());
		System.out.println(p.getNome());
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		JPAutil.shutdown();
		System.exit(0);
	}
}
