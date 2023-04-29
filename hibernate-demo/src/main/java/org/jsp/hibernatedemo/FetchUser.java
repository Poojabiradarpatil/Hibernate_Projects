package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchUser {
	private static final Object object = null;

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Id to print the details");
//		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		s.get(User.class, false);
		s.delete(object);
//		System.out.println(u);
//		if (u != null) {
//			System.out.println("User found");
//			System.out.println("ID:" + u.getId());
//			System.out.println("name:" + u.getName());
////			System.out.println("Age:" + u.getAge());
////			System.out.println("Phone:" + u.getPhone());
//		} else {
//			System.err.println("Invalid ID");
//		}
	}
}
