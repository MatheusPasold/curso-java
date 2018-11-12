package aula35;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaExemplo {
	public static void main(String[] args) {

		EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
		Session session = (Session) em.getDelegate();

		/*
		 * public void selectTodos() { CriteriaBuilder cb = em.getCriteriaBuilder();
		 * CriteriaQuery<Cidade> cQuery = cb.createQuery(Cidade.class); Root<Cidade> c =
		 * cQuery.from(Cidade.class); cQuery.select(c); TypedQuery<Cidade> query =
		 * em.createQuery(cQuery); List<Cidade> results = query.getResultList(); for
		 * (Cidade cidades : results) { System.out.println("Cidade: " +
		 * cidades.getNome() + " Estado: " + cidades.getEstado().getNome()); } }
		 * 
		 * CriteriaBuilder cb = em.getCriteriaBuilder(); CriteriaQuery<Cidade> cQuery =
		 * cb.createQuery(Cidade.class); Root<Cidade> c = cQuery.from(Cidade.class);
		 * cQuery.select(c); ParameterExpression<Integer> p =
		 * cb.parameter(Integer.class); cQuery.where(cb.equal(c.get("nome"),
		 * "Blumenau")); //cQuery.orderBy(cb.asc(c.get("nome"))); TypedQuery<Cidade>
		 * query = em.createQuery(cQuery); List<Cidade> results = query.getResultList();
		 * 
		 * for (Cidade cidades : results) { System.out.println("Cidade: " +
		 * cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. " +
		 * cidades.getPopulacao()); }
		 */

		// min
		/*
		 * CriteriaBuilder cb = em.getCriteriaBuilder(); CriteriaQuery<Integer> cQuery =
		 * cb.createQuery(Integer.class); Root<Cidade> c = cQuery.from(Cidade.class);
		 * cQuery.select(cb.min(c.get("populacao"))); TypedQuery<Integer> query =
		 * em.createQuery(cQuery); Integer results = query.getSingleResult();
		 * System.out.println(results);
		 */

		// max
		/*
		 * CriteriaBuilder cb = em.getCriteriaBuilder(); CriteriaQuery<Integer> cQuery =
		 * cb.createQuery(Integer.class); Root<Cidade> c = cQuery.from(Cidade.class);
		 * cQuery.select(cb.max(c.get("populacao"))); TypedQuery<Integer> query =
		 * em.createQuery(cQuery); Integer results = query.getSingleResult();
		 * System.out.println(results);
		 */

		// count
		/*CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cQuery = cb.createQuery(Long.class);
		Root<Cidade> c = cQuery.from(Cidade.class);
		cQuery.multiselect(cb.count(c.get("nome")));
		TypedQuery<Long> query = em.createQuery(cQuery);
		Long results = query.getSingleResult();
		System.out.println(results);
		*/ 
		

//Duas Condições where
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
		Root<Cidade> c = cQuery.from(Cidade.class);
		cQuery.where(
		builder.gt(c.get("populacao"), 300000),
		//gt = greaterThanOrEqualTo
		builder.lt(c.get("populacao"), 400000)
		//lt = lessThanOrEqualTo
		);

		TypedQuery<Cidade> query = em.createQuery(cQuery);
		List<Cidade> results = query.getResultList();
		for(Cidade cidade : results) {
		System.out.println("Cidade: " + cidade.getNome() + "Estado: " + cidade.getEstado().getNome() + "Pop.: " + cidade.getPopulacao());
		}
		
		/**
		 * Condição Where
		 * 
		 * CriteriaBuilder builder = em.getCriteriaBuilder(); CriteriaQuery<Cidade>
		 * cQuery = builder.createQuery(Cidade.class); Root<Cidade> cidade =
		 * cQuery.from(Cidade.class); cQuery.select(cidade);
		 * ParameterExpression<Integer> p = builder.parameter(Integer.class);
		 * cQuery.where(builder.equal(cidade.get("nome"), "Blumenau"));
		 * //cQuery.orderBy(cb.asc(c.get("nome"))); TypedQuery<Cidade> query =
		 * em.createQuery(cQuery); List<Cidade> results = query.getResultList();
		 * 
		 * for (Cidade cidades : results) { System.out.println("Cidade: " +
		 * cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. " +
		 * cidades.getPopulacao()); }
		 * 
		 * 
		 */

		/*
		 * Duas Condições where cQuery.where( builder.gt(cidade.get("populacao"),
		 * 300000), //gt = greaterThanOrEqualTo builder.lt(cidade.get("populacao"),
		 * 400000) //lt = lessThanOrEqualTo );
		 * 
		 * 
		 */

		/*
		 * // avg CriteriaBuilder cb = em.getCriteriaBuilder(); CriteriaQuery<Double>
		 * cQuery = cb.createQuery(Double.class); Root<Cidade> c =
		 * cQuery.from(Cidade.class); cQuery.multiselect(cb.avg(c.get("populacao")));
		 * TypedQuery<Double> query = em.createQuery(cQuery); double results =
		 * query.getSingleResult(); System.out.println(results);
		 * 
		 * 
		 */

		/*
		 * // Select coluna 1 e 2 CriteriaBuilder cb = em.getCriteriaBuilder();
		 * CriteriaQuery<Object[]> cQuery = cb.createQuery(Object[].class); Root<Cidade>
		 * c = cQuery.from(Cidade.class); cQuery.select(cb.array(c.get("nome"),
		 * c.get("populacao"))); //cQuery.orderBy(cb.asc(c.get("nome")));
		 * TypedQuery<Object[]> query = em.createQuery(cQuery); List<Object[]> results =
		 * query.getResultList(); for (Object[] cidades : results) {
		 * System.out.println("Cidade: " + cidades[0] + " Pop.: " + cidades[1]); }
		 * 
		 */
//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		resultado = crit.list();
//		for (Cidade c : resultado) {
//			System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.setMaxResults(5);
//		resultado = crit.list();
//		for(Cidade c : resultado) {
//		System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

		/// Esse método retorna os registros a partir do registro que você deseja,
//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.setFirstResult(16);
//		resultado = crit.list();
//		for(Cidade c : resultado) {
//		System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

		// Utilizado para retornar apenas um registro.
//		Cidade c = new Cidade();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.setMaxResults(1);
//		c = (Cidade) crit.uniqueResult();
//		System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());

		// Criteria addOrder(Order order);
//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.addOrder(Order.asc("nome"));
//		resultado = crit.list();
//		for(Cidade c : resultado) {
//		System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.add(Restrictions.eq("nome", "Paranavaí"));
//		resultado = crit.list();
//		for (Cidade c : resultado) {
//			System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

		/*
		 * List<Cidade> resultado = new ArrayList<Cidade>(); Criteria crit =
		 * session.createCriteria(Cidade.class);
		 * crit.add(Restrictions.or(Restrictions.eq("nome", "Paranavaí"),
		 * Restrictions.eq("nome", "Blumenau"))); resultado = crit.list(); for (Cidade c
		 * : resultado) { System.out.println("Cidade: " + c.getNome() + " Estado: " +
		 * c.getEstado().getNome()); }
		 */

//		List<Cidade> resultado = new ArrayList<Cidade>();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.add(Restrictions.ilike("nome", "a", MatchMode.ANYWHERE));
//		crit.add(Restrictions.ilike("nome", "u", MatchMode.END));
//		resultado = crit.list();
//		for (Cidade c : resultado) {
//			System.out.println("Cidade: " + c.getNome() + " Estado: " + c.getEstado().getNome());
//		}

//		List resultado = new ArrayList();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.setProjection(Projections.rowCount());
//		Long i = (Long) crit.uniqueResult();
//		System.out.println("A quantidade de registros é: " + i);

//		List resultado = new ArrayList();
//		Criteria crit = session.createCriteria(Cidade.class);
//		crit.setProjection(Projections.avg("valor"));
//		Long i = (Long) crit.uniqueResult();
//		System.out.println("A quantidade de registros é: " + i);

	}
}
