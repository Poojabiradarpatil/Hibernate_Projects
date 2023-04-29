package org.jsp.hibernatejpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id to print the details");
		int id = sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Employee e = manager.find(Employee.class, id);
		if (e != null) {
			manager.remove(e);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			System.out.println("Employee has been deleted");
		} else {
			System.err.println("You have entered an Invalid ID");
		}
	}
}
