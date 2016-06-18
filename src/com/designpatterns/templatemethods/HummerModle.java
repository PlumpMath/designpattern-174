package com.designpatterns.templatemethods;

public abstract class HummerModle {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected void run() {
		this.start();
		this.engineBoom();
		if (isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

	protected boolean isAlarm() {
		return true;
	}
}
