package org.jsp.onetomanyuni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBranchByHospitalId {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Hospital hospital = manager.find(Hospital.class, 2);
		if (hospital != null) {
			List<Branch> branches = hospital.getBranches();
			for (Branch b : branches) {
				System.out.println(b);
			}
		}
	}
}
