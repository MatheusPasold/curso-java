package aula32;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProdutoDAO implements RepositorioProduto {

	/**private Produto carregarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		double preco = cursor.getDouble("preco");
		return new Produto(id, nome, preco);
	}**/

	public List<Produto> buscarTodos() {
		List<Produto> produtos = new ArrayList<Produto>();
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from produtos", Produto.class);
		produtos = query.getResultList();
		em.close();
		return produtos;
	}

	public List<Produto> buscarPorNome(String nome) {
		List<Produto> produtos = new ArrayList<Produto>();
		if (nome != null) {
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			TypedQuery<Produto> query = em.createQuery("from Contato c where upper(c.nome) like upper(:nome)",
					Produto.class);
			query.setParameter(1, "%" + nome + "%");
			produtos = query.getResultList();
			em.close();
		}
		return produtos;
	}

	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		List<Produto> produtos = new ArrayList<Produto>();
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Contato c where preco > ? AND preco < ?", Produto.class);
		query.setParameter(1, minimo);
		query.setParameter(1, maximo);
		produtos = query.getResultList();
		em.close();
		return produtos;
	}

	public Produto buscarPorId(Integer id) {
		Produto produto;
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}

	public void inserir(Produto produto) {
		if(produto != null && produto.getId() == null){
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			em.close();
		}
	}

	public void atualizar(Produto produto) {
		if(produto != null && produto.getId() != null){
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();
			em.close();
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
	}

	public void remover(Integer id) {
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		em.remove(id);
		em.close();
	}

	public int contar() {
		int quantidade = 0;
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			em.createQuery("count(*) from produtos", Produto.class);
			
		return quantidade;
	}

}
