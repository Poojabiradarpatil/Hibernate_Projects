package org.jsp.onetomanybi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.onetomanybi.dto.Department;
import org.jsp.onetomanybi.dto.Employee;

public class FetchDepartment {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Department d = manager.find(Department.class, 1);
		System.out.println(d);
		List<Employee> emps = d.getEmps();
		System.out.println(emps);
	}
}
