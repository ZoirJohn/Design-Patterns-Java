package com.iterator;

public class Main {
	public static void main(String[] args) {

		DinerMenu menu = new DinerMenu();
		menu.addItem(new MenuItem("Osh", "Rice", false, 100));
		menu.addItem(new MenuItem("Shurpa", "Soup", false, 100));
		menu.addItem(new MenuItem("Mastava", "Rice soup", true, 120));

		Waitress dolly = new Waitress(menu);
		dolly.printMenu();
	}
}