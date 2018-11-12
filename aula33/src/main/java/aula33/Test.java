package aula33;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		EntityManager entityManeger = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManeger.getTransaction().begin();
		Tarefa t1 = new Tarefa(null, "Domador de Elefantes", StatusTarefa.NOVA, new Date(), new Date(),null);
		Usuario u = new Usuario(null, "Tibúrcio Adm","tibadm@gmail.com", Arrays.asList(t1));
		t1.setUsuario(u);
		Set<PerfilUsuario> perfis = new HashSet<>();
		perfis.add(PerfilUsuario.BAGRINHO);
		perfis.add(PerfilUsuario.MANAGER);
		perfis.add(PerfilUsuario.ADMIN);
		u.setPerfis(perfis);
		entityManeger.persist(u);
		/**Tarefa tarefa = new Tarefa();
		tarefa.setTitulo("Minha primeira tarefa");
		tarefa.setStatus(StatusTarefa.NOVA);
		tarefa.setCriadoEm(new Date());
		tarefa.setAtualizadoEm(new Date());
		**/
		entityManeger.getTransaction().commit();
		entityManeger.close();		
		JPAutil.shutdown();
		System.exit(0);		
	}
}
