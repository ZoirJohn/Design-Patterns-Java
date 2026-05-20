package com.adapter.adapters;

import com.adapter.interfaces.Duck;
import com.adapter.objects.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			this.turkey.fly();
		}
	}

	@Override
	public void quack() {
		turkey.wobble();
	}
}
