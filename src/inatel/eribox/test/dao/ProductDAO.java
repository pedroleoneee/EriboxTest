package inatel.eribox.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import inatel.eribox.test.entity.Product;

@Repository
public class ProductDAO extends GenericDAO<inatel.eribox.test.entity.Product, Integer> {

	public void saveProduct(Product product) {
		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("eribox_test");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Autowired
//	public void findAllProducts() {
//		try {
//			session.findAll()
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Autowired
//	public void findProductById(id) {
//		try {
//			session.findAll()
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Autowired
//	public void updateProduct(Product product) {
//		try {
//			session.findAll()
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Autowired
//	public void deleteProduct(id) {
//		try {
//			session.findAll()
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
