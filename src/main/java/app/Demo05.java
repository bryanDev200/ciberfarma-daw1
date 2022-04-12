package app;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	
	import model.Usuario;

public class Demo05 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Usuario u = em.find(Usuario.class, 90);
		if(u == null) {
			System.err.println("Codigo no existe");
		}else {
			em.remove(u);
			System.out.println("Usuario eliminado");
		}
		em.getTransaction().commit();
		em.close();
	}
}