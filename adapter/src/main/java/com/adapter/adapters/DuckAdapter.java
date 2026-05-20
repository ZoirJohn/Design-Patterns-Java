package com.adapter.adapters;

import java.util.Random;

import com.adapter.interfaces.Turkey;
import com.adapter.objects.Duck;

public class DuckAdapter implements Turkey {
	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		Random ran = new Random();
		if (ran.nextInt(5) == 0) {
			this.duck.fly();
		}
	}

	@Override
	public void wobble() {
		this.duck.quack();
	}

}
