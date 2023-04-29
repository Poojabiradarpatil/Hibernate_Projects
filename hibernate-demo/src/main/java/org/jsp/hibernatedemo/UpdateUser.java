package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	public static void main(String[] args) {
		User u = new User();
		u.setId(1);
		u.setName("sp");
		u.setPassword("s123");
		u.setAge(28);
		u.setPhone(9999);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.update(u);
		t.commit();
	}
}
