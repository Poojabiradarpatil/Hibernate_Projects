package org.jsp.manytomanyuni.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.manytomanyuni.dto.Batch;
import org.jsp.manytomanyuni.dto.Student;

public class FetchStudentsByBatchId {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the batch id to display students");
		int id = s.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Batch b = manager.find(Batch.class, id);
		if (b != null) {
			List<Student> students = b.getStudents();
			for (Student st : students) {
				System.out.println(st);
			}
		}
		else {
			System.out.println("Invalid Batch ID");
		}
	}
}
