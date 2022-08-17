package com.ty.one.to.many.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one.to.many.dto.FoodOrder;
import com.ty.one.to.many.dto.Item;

public class TestGetFoodOrderById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		FoodOrder food = entityManager.find(FoodOrder.class, 1);
		System.out.println("Food Id is " + food.getId());
		System.out.println("Food Address is " + food.getAddress());
		System.out.println("Food Customer_Name is " + food.getCustomername());
		System.out.println("Food Customer_PhoneNo is " + food.getPhone());
		List<Item> item = food.getItem();
		for (Item item1 : item) {
			System.out.println("Item Id is " + item1.getId());
			System.out.println("Item Id is " + item1.getName());
			System.out.println("Item Id is " + item1.getQuantity());
			System.out.println("Item Id is " + item1.getCost());
			System.out.println("--------------------------------");
		}

	}

}
