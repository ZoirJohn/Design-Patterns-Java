package com.observer.display;

import com.observer.implementation.DisplayElement;
import com.observer.implementation.Observer;
import com.observer.implementation.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Double temperature;
	private Double humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(Double temperature, Double humidity, Double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
	public Subject getWeatherData() {
		return weatherData;
	}
}