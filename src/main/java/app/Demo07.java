package app;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.persistence.TypedQuery;
	
	import model.Usuario;

public class Demo07 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		TypedQuery<Usuario> consulta = em.createQuery("select a from Usuario a where a.tipo = :tipo", Usuario.class);
		consulta.setParameter("tipo", 2);
		List<Usuario> list = consulta.getResultList();
		for(Usuario u : list) {
			System.out.println(u);
		}
		em.close();
	}
}