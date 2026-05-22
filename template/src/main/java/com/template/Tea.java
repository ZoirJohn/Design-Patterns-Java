package com.template;

public class Tea extends Beverage {
	@Override
	public void add() {
		System.out.println("Adding honey");
	}

	@Override
	public void mix() {
		System.out.println("Mixing black tea");
	}
}
