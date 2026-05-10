package com.strategy.action;

import com.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Normal quack");
	}
}
