package org.jsp.onetomanybi.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanybi.dto.Department;
import org.jsp.onetomanybi.dto.Employee;

public class SaveDeptAndEmp {
	public static void main(String[] args) {
		Department d = new Department();
		d.setName("Development");
		d.setLocation("BTM Layout");

		Employee e1 = new Employee();
		e1.setDept(d);
		e1.setDesg("Testing");
		e1.setName("Sushma");
		e1.setSalary(50000);

		Employee e2 = new Employee();
		e2.setDept(d);
		e2.setDesg("Front End");
		e2.setName("Sanjana");
		e2.setSalary(40000);

		Employee e3 = new Employee();
		e3.setDept(d);
		e3.setDesg("Owner");
		e3.setName("Pooja");
		e3.setSalary(100000);
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e1, e2, e3)));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(d);
		transaction.begin();
		transaction.commit();
	}
}
