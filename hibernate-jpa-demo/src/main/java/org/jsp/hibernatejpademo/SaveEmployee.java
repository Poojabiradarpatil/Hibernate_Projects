package org.jsp.hibernatejpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Pooja");
		e.setDept("Development");
		e.setDesg("Java full stack developer");
		e.setSalary(8748748);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(e);
		transaction.begin();
		transaction.commit();
	}
}
