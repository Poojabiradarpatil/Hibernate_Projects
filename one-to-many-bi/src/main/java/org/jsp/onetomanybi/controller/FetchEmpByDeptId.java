package org.jsp.onetomanybi.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomanybi.dto.Employee;

public class FetchEmpByDeptId {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dept ID to display Employee details");
		int did = s.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery("select e from Employee e where e.dept.id=?1");
		q.setParameter(1, did);
		List<Employee> emps = q.getResultList();
		if (emps.size() > 0) {
			for (Employee e : emps) {
				System.out.println(e);
			}
		} else {
			System.err.println("Inavlid Deparment ID");
		}

	}
}
