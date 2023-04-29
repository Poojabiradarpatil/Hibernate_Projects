package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchUserByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to print the details");
		String name = sc.nextLine();
		String hql = "select u from User u where u.name=?1";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q = s.createQuery(hql);
		q.setParameter(1, name);
		List<User> users = q.getResultList();
		for (User u : users) {
			System.out.println("ID:" + u.getId());
			System.out.println("Name:" + u.getName());
			System.out.println("Age:" + u.getAge());
			System.out.println("Phone Number:" + u.getPhone());
			System.out.println("-------------------------------");
		}
	}
}
