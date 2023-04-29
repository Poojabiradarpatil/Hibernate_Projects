package org.jsp.onetomanybi.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.onetomanybi.dto.Employee;

public class FetchEmployee {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Employee emp = manager.find(Employee.class, 1);
		System.out.println(emp);
		System.out.println(emp.getDept());
	}
}
