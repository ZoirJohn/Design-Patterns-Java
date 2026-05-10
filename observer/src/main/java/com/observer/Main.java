package com.observer;

import com.observer.display.CurrentConditionsDisplay;
import com.observer.weather.WeatherData;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80.0, 65.0, 30.4);
		weatherData.setMeasurements(82.0, 70.0, 29.2);
		weatherData.setMeasurements(78.0, 90.0, 29.0);
		System.out.println(currentDisplay);
	}
}