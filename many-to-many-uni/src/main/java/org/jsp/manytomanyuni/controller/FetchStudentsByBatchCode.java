package org.jsp.manytomanyuni.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanyuni.dto.Batch;
import org.jsp.manytomanyuni.dto.Student;

public class FetchStudentsByBatchCode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the batch code to display students");
		String code = s.next();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select b.students from Batch b where b.code=:c";
		Query q = manager.createQuery(qry);
		q.setParameter("c", code);
		List<Student> students = q.getResultList();
		if (students.size() > 0)
			for (Student st : students) {
				System.out.println(st);
			}
	}
}
