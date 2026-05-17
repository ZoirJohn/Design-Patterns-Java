package com.singleton;

public class Singleton {
	private static volatile Singleton object;
	private static int count;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (object == null) {
			count++;
			object = new Singleton();
		}
		return object;
	}

	@Override
	public String toString() {
		return "This is singleton " + count;
	}
}
