package org.jsp.lifecycledemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHlc {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee e = new Employee();// Transient state
		e.setName("PoojaS");
		e.setDesg("Lg");
		e.setPhone(777);
		manager.persist(e);// persistent state
		e.setName("Rock");
		e.setDesg("Devp");
		transaction.begin();
		transaction.commit();
		manager.detach(e);// Detached state
		e.setName("poo");
		e.setDesg("queen");
		transaction.begin();
		transaction.commit();

	}
}
