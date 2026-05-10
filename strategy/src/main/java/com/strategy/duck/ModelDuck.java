package com.strategy.duck;

import com.strategy.action.FlyNoWay;
import com.strategy.action.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I’m a real Model duck");
	}
}