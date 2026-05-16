package com.factory;

import com.factory.classes.PizzaStore;

public class NYCPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		return new Pizza(type);
	}
}
