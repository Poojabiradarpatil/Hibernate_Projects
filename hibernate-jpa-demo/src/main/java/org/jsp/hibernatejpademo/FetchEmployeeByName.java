package org.jsp.hibernatejpademo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmployeeByName {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your name to print the detials");
		String name = s.next();
		String qry = "select e from Employee e where e.name=?1";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		List<Employee> emps = q.getResultList();
		if (emps.size() > 0) {
			for (Employee e : emps) {
				System.out.println("ID:" + e.getId());
				System.out.println("name:" + e.getName());
				System.out.println("Department:" + e.getDept());
				System.out.println("designation:" + e.getDesg());
				System.out.println("Salary:" + e.getSalary());
				System.out.println("------------------------------");
			}
		} else {
			System.out.println("No Employee found with the name:" + name);
		}

	}
}
