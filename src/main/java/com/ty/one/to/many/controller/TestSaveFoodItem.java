package com.ty.one.to.many.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.FoodOrder;
import com.ty.one.to.many.dto.Item;

public class TestSaveFoodItem {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		List<Item> item = new ArrayList<Item>();
		Item item1 = new Item();
		item1.setName("Tandoori");
		item1.setQuantity(1);
		item1.setCost(450);
		Item item2 = new Item();
		item2.setName("Al-fam");
		item2.setQuantity(2);
		item2.setCost(250);
		item.add(item1);
		item.add(item2);
		FoodOrder food = new FoodOrder();
		food.setAddress("Bangalore Btm");
		food.setCustomername("MoinAhmed");
		food.setPhone(9448289920l);
		food.setItem(item);
		entityTransaction.begin();
		entityManager.persist(food);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();
		System.out.println("--Data Inserted--");

	}

}
