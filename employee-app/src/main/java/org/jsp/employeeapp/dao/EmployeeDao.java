package org.jsp.employeeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.employeeapp.dto.Employee;

public class EmployeeDao {
	Session session = new Configuration().configure().buildSessionFactory().openSession();

	public Employee saveEmployee(Employee emp) {
		Transaction t = session.beginTransaction();
		session.save(emp);
		t.commit();
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		Transaction t = session.beginTransaction();
		session.update(emp);
		t.commit();
		return emp;
	}

	public Employee findEmployeeById(int id) {
		return session.get(Employee.class, id);
	}

	public boolean deleteEmployee(int id) {
		Employee e = findEmployeeById(id);
		if (e != null) {
			session.delete(e);
			Transaction t = session.beginTransaction();
			t.commit();
			return true;
		}
		return false;
	}

	public Employee verifyEmployee(long phone, String password) {
		String hql = "select e from Employee e where e.phone=?1 and e.password=?2";
		Query<Employee> q = session.createQuery(hql);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<Employee> emps = q.getResultList();
		if (emps.size() > 0) {
			return emps.get(0);
		}
		return null;
	}
}
