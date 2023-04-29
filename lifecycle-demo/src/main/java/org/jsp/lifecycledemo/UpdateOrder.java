package org.jsp.lifecycledemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOrder {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		FoodOrder order = manager.find(FoodOrder.class, 1);
		order.setCost(167);
		transaction.begin();
		transaction.commit();
	}
}
