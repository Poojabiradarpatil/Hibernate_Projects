package org.jsp.hibernatejpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id to print the details");
		int id = sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Employee e = manager.find(Employee.class, id);
		if (e != null) {
			System.out.println("ID:" + e.getId());
			System.out.println("Name:" + e.getName());
			System.out.println("Department:" + e.getDept());
			System.out.println("designation:" + e.getDesg());
			System.out.println("Salary:" + e.getSalary());
		} else {
			System.err.println("You have entered an Invalid ID");
		}
	}
}
