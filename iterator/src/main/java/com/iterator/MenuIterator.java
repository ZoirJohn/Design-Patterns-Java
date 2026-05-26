package com.iterator;

public class MenuIterator implements Iterator {
	private MenuItem[] menuItems;
	private int position = 0;

	public MenuIterator(MenuItem[] items) {
		this.menuItems = items;
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.menuItems.length || this.menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = this.menuItems[position];
		position = position + 1;
		return menuItem;
	}
}
