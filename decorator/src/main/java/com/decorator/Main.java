package com.decorator;

import com.decorator.beverage.Beverage;
import com.decorator.beverage.Espresso;
import com.decorator.beverage.Mocha;

public class Main {
	public static void main(String[] args) {
		Beverage beverage = new Espresso("Espresso");
		Beverage beverage1 = new Mocha(beverage);
		System.out.println(beverage.getDescription());
		System.out.println(beverage1.cost());
	}
}