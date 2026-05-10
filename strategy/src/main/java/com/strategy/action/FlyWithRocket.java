package com.strategy.action;

import com.strategy.behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Flying with rocket");
	}
}
