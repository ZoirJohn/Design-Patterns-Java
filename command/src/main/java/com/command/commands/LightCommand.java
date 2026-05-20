package com.command.commands;

import com.command.items.Light;

public class LightCommand implements Command {

	private Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.on();
	}

	@Override
	public String toString() {

		return "Light command";
	}

	@Override
	public String getState() {
		return this.light.getState();
	}
}