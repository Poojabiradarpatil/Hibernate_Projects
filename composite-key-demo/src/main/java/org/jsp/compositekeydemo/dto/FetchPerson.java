package org.jsp.compositekeydemo.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPerson {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you email and phone Number");
		String email = s.next();
		long phone = s.nextLong();
		PersonId id = new PersonId();
		id.setEmail(email);
		id.setPhone(phone);
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Person p = manager.find(Person.class, id);
		if (p != null) {
			System.out.println("name:" + p.getName());
			System.out.println("Email ID:" + p.getId().getEmail());
			System.out.println("Phone Number:" + p.getId().getPhone());
		} else {
			System.err.println("Invalid Phone Number or Email");
		}
	}
}
