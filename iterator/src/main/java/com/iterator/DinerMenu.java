package com.iterator;

public class DinerMenu {
	static final int MAX_ITEMS = 5;
	int numberOfItems = 0;
	private MenuItem[] items;

	public DinerMenu() {
		items = new MenuItem[MAX_ITEMS];
	}

	public void addItem(MenuItem item) {
		items[numberOfItems] = item;
		numberOfItems++;
	}

	public Iterator createIterator() {
		return new MenuIterator(this.items);
	}
}
