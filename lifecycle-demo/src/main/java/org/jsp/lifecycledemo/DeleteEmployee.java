package org.jsp.lifecycledemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee e = manager.find(Employee.class, 1);// persistent state
		manager.remove(e);// removed state
		transaction.begin();
		transaction.commit();
	}
}
