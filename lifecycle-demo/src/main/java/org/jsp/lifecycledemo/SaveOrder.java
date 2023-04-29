package org.jsp.lifecycledemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrder {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		FoodOrder order = new FoodOrder();
		order.setCost(100);
		order.setItem("fingerchips");
		manager.persist(order);
		transaction.begin();
		transaction.commit();
	}
}
