package com.template;

public class Coffee extends Beverage {
	@Override
	public void add() {
		System.out.println("Adding milk");
	}

	@Override
	public void mix() {
		System.out.println("Mixing coffee");
	}
}
