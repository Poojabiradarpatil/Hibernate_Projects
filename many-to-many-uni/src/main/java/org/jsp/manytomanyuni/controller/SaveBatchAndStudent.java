package org.jsp.manytomanyuni.controller;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomanyuni.dto.Batch;
import org.jsp.manytomanyuni.dto.Student;

public class SaveBatchAndStudent {
	public static void main(String[] args) {
		Batch b1 = new Batch();
		b1.setCode("SEHM21");
		b1.setSubject("Hibernate");

		Batch b2 = new Batch();
		b2.setCode("SESM21");
		b2.setSubject("Spring");

		Batch b3 = new Batch();
		b3.setCode("SJPM3");
		b3.setSubject("Workshop");

		Student s1 = new Student();
		s1.setName("Pushpa");
		s1.setPhone(8888);

		Student s2 = new Student();
		s2.setName("Rocky");
		s2.setPhone(7777);

		Student s3 = new Student();
		s3.setName("Bahubali");
		s3.setPhone(9999);
		// Assigning students for Hibernate
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1, s2, s3)));
		// Assigning students for Spring
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1, s2, s3)));
		// Assigning students for Workshop
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1, s2, s3)));
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();

	}
}
