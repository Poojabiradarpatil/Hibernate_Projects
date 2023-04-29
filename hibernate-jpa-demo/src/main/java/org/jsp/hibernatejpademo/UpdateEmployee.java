package org.jsp.hibernatejpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ID to update");
		int id = sc.nextInt();
		System.out.println("Enter department,designation,name and salary to update");
		String dept = sc.next();
		String desg = sc.next();
		String name = sc.next();
		double salary = sc.nextDouble();
		Employee e = new Employee();
		e.setId(id);
		e.setDept(dept);
		e.setDesg(desg);
		e.setName(name);
		e.setSalary(salary);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.merge(e);
		transaction.begin();
		transaction.commit();

	}
}
