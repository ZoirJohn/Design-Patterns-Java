package com.state;

import com.state.states.HasQuarterState;
import com.state.states.NoQuarterState;
import com.state.states.SoldOutState;
import com.state.states.SoldState;
import com.state.states.State;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State state = soldOutState;
	private int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getHasQuarterState() {
		return this.hasQuarterState;
	}

	public State getNoQuarterState() {
		return this.noQuarterState;
	}

	public State getSoldState() {
		return this.soldState;
	}

	public State getSoldOutState() {
		return this.soldOutState;
	}

	public int getCount() {
		return this.count;
	}

}