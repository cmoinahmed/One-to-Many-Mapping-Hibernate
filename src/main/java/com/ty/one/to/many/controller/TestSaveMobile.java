package com.ty.one.to.many.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.Mobile;
import com.ty.one.to.many.dto.Sim;

public class TestSaveMobile {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		List<Sim> sims = new ArrayList<Sim>();
		Sim sim1 = new Sim();
		sim1.setProvider("Bsnl");
		sim1.setImrc(7895);
		Sim sim2 = new Sim();
		sim2.setProvider("Airtel");
		sim2.setImrc(89452);
		sims.add(sim1);
		sims.add(sim2);
		Mobile mobile = new Mobile();
		mobile.setName("Nokia");
		mobile.setCost(10000);
		mobile.setSim(sims);
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
		System.out.println("--Data Inserted--");

	}

}
