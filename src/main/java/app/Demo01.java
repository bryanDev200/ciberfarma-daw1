package app;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	
	import model.Usuario;

public class Demo01 {
	public static void main(String[] args) {
		Usuario u = new Usuario(6, "Juan", "Perez", "jperez@mail.com", "345", "2000/01/15", 1, 1);
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
}