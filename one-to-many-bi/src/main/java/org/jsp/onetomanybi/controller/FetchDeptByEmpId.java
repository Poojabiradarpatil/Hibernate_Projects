package org.jsp.onetomanybi.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.onetomanybi.dto.Department;
import org.jsp.onetomanybi.dto.Employee;

public class FetchDeptByEmpId {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee ID to display the department details");
		int eid = s.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Employee e = manager.find(Employee.class, eid);
		if (e != null) {
			Department d = e.getDept();
			System.out.println("Department ID:" + d.getId());
			System.out.println("Department Name:" + d.getName());
			System.out.println("location:" + d.getLocation());
		} else {
			System.err.println("Invalid Employee ID");
		}
	}
}
