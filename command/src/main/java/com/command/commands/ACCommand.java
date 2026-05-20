package com.command.commands;

import com.command.items.AC;

public class ACCommand implements Command {
	private AC ac;

	public ACCommand(AC ac) {
		this.ac = ac;
	}

	public void execute() {
		this.ac.on();
	}

	@Override
	public String toString() {

		return "AC command";
	}

	@Override
	public String getState() {
		return this.ac.getState();
	}
}
