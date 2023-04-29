package org.jsp.manytomanyuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.manytomanyuni.dto.Batch;

public class FetchBatch {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Batch b = manager.find(Batch.class, 1);
		System.out.println(b);
		System.out.println(b.getStudents());
	}
}
