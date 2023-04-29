package org.jsp.onetooneuni;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndCard {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person p = new Person();
		p.setName("Gaju");
		p.setAge(28);
		p.setPhone(9019);

		PanCard card = new PanCard();
		card.setNumber("gaju45");
		card.setDob(LocalDate.parse("1994-02-14"));
		card.setPincode(591201);
		// Assign PanCard for Person
		p.setCard(card);
		manager.persist(p);
		transaction.begin();
		transaction.commit();

	}
}
