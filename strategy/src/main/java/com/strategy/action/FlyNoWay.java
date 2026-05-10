package com.strategy.action;

import com.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("No flying");
	}
}
