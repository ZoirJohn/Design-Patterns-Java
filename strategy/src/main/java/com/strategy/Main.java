package com.strategy;

import com.strategy.action.FlyWithRocket;
import com.strategy.duck.Duck;
import com.strategy.duck.MallardDuck;
import com.strategy.duck.ModelDuck;

public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyWithRocket());
		model.performFly();
	}
}