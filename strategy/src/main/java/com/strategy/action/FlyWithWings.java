package com.strategy.action;

import com.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}
}
