package com.ty.one.to.many.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.Bus;
import com.ty.one.to.many.dto.Organization;


public class TestGetOrganizationById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Organization organization  = entityManager.find(Organization.class, 1);
		Organization organization1  = entityManager.find(Organization.class, 2);
		System.out.println("Id is "+organization.getId());
		System.out.println("Name is "+organization.getName());
		System.out.println("Address is "+organization.getAddress());
		System.out.println("Id is "+organization1.getId());
		System.out.println("Name is "+organization1.getName());
		System.out.println("Address is "+organization1.getAddress());
		List<Bus> bus = organization.getBus();
		for(Bus bus1 : bus) {
			System.out.println("Id is "+bus1.getId());
			System.out.println("Id is "+bus1.getCapacity());
			System.out.println("Id is "+bus1.getType());
		}
		List<Bus> bus2 = organization1.getBus();
		for(Bus bus1 : bus2) {
			System.out.println("Id is "+bus1.getId());
			System.out.println("Id is "+bus1.getCapacity());
			System.out.println("Id is "+bus1.getType());
		}

	}

}
