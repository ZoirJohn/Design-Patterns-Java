package com.decorator.beverage;

public class Espresso extends Beverage {
	public Espresso(String description) {
		this.description = description;
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
