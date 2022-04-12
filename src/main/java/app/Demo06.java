package app;
	
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.persistence.TypedQuery;

	import model.Usuario;

public class Demo06 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//forma 1: es mejor utilizarla cuando se trabaja con parametros 
		TypedQuery<Usuario> consulta = em.createQuery("select a from Usuario a", Usuario.class);
		List<Usuario> listUsuarios = consulta.getResultList();
		//forma 2: es mas resumida pero no es conveniente cuando se usan parametros
		//List<Usuario> listUsuarios2 = em.createQuery("select a from Usuario a", Usuario.class).getResultList();
		for(Usuario u : listUsuarios) {
			System.out.println(u);
		}
		em.close();
	}
}
