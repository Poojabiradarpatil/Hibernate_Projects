package org.jsp.manytooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytooneuni.dto.Answer;
import org.jsp.manytooneuni.dto.Question;

public class SaveQuestionAndAnswer {
	public static void main(String[] args) {
		Question q = new Question();
		q.setQuestion("What is Spring-Boot?");
		q.setQuestionedBy("Pooja");

		Answer a1 = new Answer();
		a1.setAnswer("Spring is OpenSource");
		a1.setAnsweredBy("Sanjana");
		a1.setQuestion(q);

		Answer a2 = new Answer();
		a2.setAnswer("Hibernate is Non-Invasive");
		a2.setAnsweredBy("AllSTUDENTS");
		a2.setQuestion(q);

		Answer a3 = new Answer();
		a3.setAnswer("Hibernate is Lighweight and ORM tool");
		a3.setAnsweredBy("Everyone");
		a3.setQuestion(q);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(a1);
		manager.persist(a2);
		manager.persist(a3);
		transaction.begin();
		transaction.commit();

	}
}
