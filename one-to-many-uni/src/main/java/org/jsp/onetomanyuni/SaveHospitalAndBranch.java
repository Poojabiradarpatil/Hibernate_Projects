package org.jsp.onetomanyuni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalAndBranch {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setGst("apollo1334");
		hospital.setFounder("ABC");

		Branch b1 = new Branch();
		b1.setName("Apollo Bangalore");
		b1.setEmail("AB@gmail.com");
		b1.setPhone(888);

		Branch b2 = new Branch();
		b2.setName("Apollo Mysore");
		b2.setEmail("AM@gmail.com");
		b2.setPhone(777);

		Branch b3 = new Branch();
		b3.setName("Apollo Mangalore");
		b3.setEmail("AMng@gmail.com");
		b3.setPhone(999);

		hospital.setBranches(new ArrayList<Branch>(Arrays.asList(b1, b2, b3)));
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(hospital);
		transaction.begin();
		transaction.commit();
	}
}
