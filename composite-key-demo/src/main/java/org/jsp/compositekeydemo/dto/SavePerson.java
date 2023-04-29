package org.jsp.compositekeydemo.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		PersonId id = new PersonId();
		id.setEmail("poo@gmail.com");
		id.setPhone(1424);
		Person p = new Person();
		p.setName("Pooja");
		p.setPassword("a2414");
		p.setId(id);
		manager.persist(p);
		transaction.begin();
		transaction.commit();
	}
}
