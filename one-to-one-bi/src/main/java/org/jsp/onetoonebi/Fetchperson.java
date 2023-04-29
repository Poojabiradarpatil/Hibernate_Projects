package org.jsp.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Fetchperson {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Person p = manager.find(Person.class, 1);
		System.out.println(p);
		System.out.println(p.getCard());

	}
}
