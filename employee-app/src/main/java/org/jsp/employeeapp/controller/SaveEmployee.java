package org.jsp.employeeapp.controller;

import org.jsp.employeeapp.dao.EmployeeDao;
import org.jsp.employeeapp.dto.Employee;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("ABC");
		e.setPassword("A123");
		e.setPhone(8776);
		e.setDesg("Trainer");
		e.setSalary(761112);
		EmployeeDao dao = new EmployeeDao();
		e = dao.saveEmployee(e);
		System.out.println("Your Details are registered with ID:" + e.getId());
	}
}
