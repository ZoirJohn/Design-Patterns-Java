package com.template;

public abstract class Beverage {
	final void prepare() {
		boilWater();
		mix();
		pour();
		add();
	}

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pour() {
		System.out.println("Pour");
	}

	public abstract void mix();

	public abstract void add();

}
