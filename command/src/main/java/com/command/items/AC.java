package com.command.items;

public class AC {
	private boolean isOn;

	public AC() {
		this.isOn = false;
	}

	public void on() {
		this.isOn = true;
		System.out.println("AC is on");
	}

	public void off() {
		this.isOn = false;
		System.out.println("AC is off");
	}

	public String getState() {
		return "AC is " + (this.isOn ? "on" : "off");
	}
}
