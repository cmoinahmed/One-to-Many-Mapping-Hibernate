package com.ty.one.to.many.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.Bus;
import com.ty.one.to.many.dto.Organization;

public class TestSaveOrganization {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		List<Bus> bus = new ArrayList<Bus>();
		Bus bus1 = new Bus();
		bus1.setCapacity(55);
		bus1.setType("Volvo");
		Bus bus2 = new Bus();
		bus2.setCapacity(49);
		bus2.setType("MULTI_AXLE");
		bus.add(bus1);
		bus.add(bus2);
		Organization organization = new Organization();
		organization.setName("VRL");
		organization.setAddress("Karnataka");
		organization.setBus(bus);
		entityTransaction.begin();
		entityManager.persist(organization);
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		entityTransaction.commit();
		System.out.println("--Data Saved--");
	}

}
