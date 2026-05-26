package com.state.states;

import com.state.GumballMachine;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println();
	}

	@Override
	public void turnCrank() {
		System.out.println();
	}

	@Override
	public void ejectQuarter() {
		System.out.println();
	}

	@Override
	public void dispense() {
		System.out.println();
	}
}
