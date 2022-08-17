package com.ty.one.to.many.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.Mobile;
import com.ty.one.to.many.dto.Sim;

public class TestGetMobileById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager2 = factory.createEntityManager();
		Mobile mobile = entityManager2.find(Mobile.class, 1);
		System.out.println("Id is " + mobile.getId());
		System.out.println("Id is " + mobile.getName());
		System.out.println("Id is " + mobile.getCost());
		List<Sim> sims = mobile.getSim();
		for (Sim sim : sims) {
			System.out.println("Id is " + sim.getId());
			System.out.println("Id is " + sim.getProvider());
			System.out.println("Id is " + sim.getImrc());

		}

	}
}
