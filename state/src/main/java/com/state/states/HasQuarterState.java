package com.state.states;

import com.state.GumballMachine;

public class HasQuarterState implements State {
	private GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Cannot insert another");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turned...");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		this.gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}
