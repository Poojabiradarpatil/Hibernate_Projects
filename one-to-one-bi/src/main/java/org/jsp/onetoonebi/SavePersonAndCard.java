package org.jsp.onetoonebi;

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
		p.setName("Pooja");
		p.setAge(23);
		p.setPhone(910814);
		PanCard card = new PanCard();
		card.setNumber("45sp");
		card.setDob(LocalDate.parse("2000-05-24"));
		card.setPincode(591201);
		// Assign PanCard for Person
		p.setCard(card);
		// Assign Person for PanCard
		card.setP(p);
		manager.persist(p);
		transaction.begin();
		transaction.commit();

	}
}
