package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your  ID to update");
		int id = s.nextInt();
		System.out.println("Enter the name,phone,age and password");
		String name = s.next();
		long phone = s.nextLong();
		int age = s.nextInt();
		String password = s.next();
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setAge(age);
		u.setPhone(phone);
		u.setPassword(password);
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.saveOrUpdate(u);
		Transaction t = session.beginTransaction();
		t.commit();
		
		s.close();
	}
}
