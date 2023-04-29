package org.jsp.hibernatejpademo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmployees {
	public static void main(String[] args) {
		String qry = "select e from Employee e";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery(qry);
		List<Employee> emps = q.getResultList();
		for (Employee e : emps) {
			System.out.println("ID:" + e.getId());
			System.out.println("name:" + e.getName());
			System.out.println("Department:" + e.getDept());
			System.out.println("designation:" + e.getDesg());
			System.out.println("Salary:" + e.getSalary());
			System.out.println("------------------------------");
		}
	}
}
