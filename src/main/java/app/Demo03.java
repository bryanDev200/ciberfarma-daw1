package app;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Usuario u = new Usuario(3, "Carla", "Toro", "U002@gmail.com", "10002", "2022/03/24", 2, 1);
		em.remove(u);
		em.getTransaction().commit();
		em.close();
	}
}
