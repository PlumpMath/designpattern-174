package com.designpatterns.observer.byself;

public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("当前条件：" + temperature + "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		display();

	}

}
