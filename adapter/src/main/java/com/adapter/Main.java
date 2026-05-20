package com.adapter;

import com.adapter.adapters.DuckAdapter;
import com.adapter.adapters.TurkeyAdapter;
import com.adapter.interfaces.Duck;
// import com.adapter.interfaces.Turkey;
// import com.adapter.objects.Duck;
import com.adapter.objects.Turkey;

public class Main {
	public static void main(String[] args) {
		// Turkey turkey = new DuckAdapter(new Duck());
		// turkey.fly();
		// turkey.wobble();

		Duck duck = new TurkeyAdapter(new Turkey());
		duck.fly();
		duck.quack();
	}
}