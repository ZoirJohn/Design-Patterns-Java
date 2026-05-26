package com.iterator;

public class Waitress {
	private DinerMenu menu;

	public Waitress(DinerMenu menu) {
		this.menu = menu;
	}

	public void printMenu() {
		this.printMenuIterator(menu.createIterator());
	}

	private void printMenuIterator(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getName() + " " + item.getDescription() + " " + item.getPrice() + "$");
		}
	}
}
