package com.command.items;

public class Light {
	private boolean isOn;

	public Light() {
		this.isOn = false;
	}

	public void on() {
		this.isOn = true;
		System.out.println("Light is on");
	}

	public void off() {
		this.isOn = false;
		System.out.println("Light is off");
	}

	public String getState() {
		return "Light is " + (this.isOn ? "on" : "off");
	}
}
