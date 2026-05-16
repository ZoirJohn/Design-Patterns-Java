package com.factory;

public class Pizza {
	final String type;

	public Pizza(String type) {
		this.type = type;
	}

	public void prepare() {
		System.out.println(String.format("Preparing %s pizza...", this.type));
	}

	public void bake() {
		System.out.println(String.format("Baking %s pizza...", this.type));
	}

	public void cut() {
		System.out.println(String.format("Cutting %s pizza...", this.type));
	}

	public void box() {
		System.out.println(String.format("Boxing %s pizza...", this.type));
	}
}
