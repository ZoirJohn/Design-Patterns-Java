package com.state.states;

import com.state.GumballMachine;

public class NoQuarterState implements State {
	private GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Not inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turned, no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("Pay first");
	}
}
