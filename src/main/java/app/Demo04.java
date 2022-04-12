package app;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	
	import model.Usuario;

public class Demo04 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Usuario u = em.find(Usuario.class, 6);
		System.out.println(u);
		em.getTransaction().commit();
		em.close();
	}
}
