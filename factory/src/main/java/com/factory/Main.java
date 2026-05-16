package com.factory;

import com.factory.classes.PizzaStore;

public class Main {
	public static void main(String[] args) {
		PizzaStore store = new NYCPizzaStore();
		store.orderPizza("pepperoni");

	}
}