package com.observer.weather;

import java.util.ArrayList;

import com.observer.implementation.Observer;
import com.observer.implementation.Subject;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private Double temperature;
	private Double humidity;
	private Double pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	public Double getTemperature() {
		return temperature;
	}

	public Double getHumidity() {
		return humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(Double temperature, Double humidity, Double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
