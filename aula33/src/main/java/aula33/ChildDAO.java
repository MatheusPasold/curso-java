package aula33;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChildDAO implements RepositorioChild {

	@Override
	public void incluir(Child child) {
		if (child != null && child.getId() == null) {
			EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(child);
			em.getTransaction().commit();
			em.close();
		}
	}

	@Override
	public List<Child> listarTodos() {
		List<Child> childs = new ArrayList<Child>();
		EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Child> query = em.createQuery("from Child", Child.class);
		childs = query.getResultList();
		em.close();
		return childs;
	}

	@Override
	public Child listarPorId(Integer id) {
		Child child;
		EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
		child = em.find(Child.class, id);
		em.close();
		return child;
	}

	@Override
	public void atualizar(Child child) {
		if (child != null && child.getId() != null) {
			EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(child);
				em.getTransaction().commit();
				em.close();
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}
		}
	}

	@Override
	public boolean remover(Child child) {
		boolean resultado = false;
		if (child != null && child.getId() != null) {
			EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				child = em.merge(child);
				em.remove(child);
				em.getTransaction().commit();
				em.close();
				resultado = true;
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}

		}
		return resultado;
	}

}