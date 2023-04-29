package org.jsp.lifecycledemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchEmployee {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityManager manager2 = factory.createEntityManager();
		Employee e = manager.find(Employee.class, 2);
		Employee e2 = manager.find(Employee.class, 2);
		Employee e4 = manager.find(Employee.class, 3);
		Employee e3 = manager2.find(Employee.class, 2);
	}
}
