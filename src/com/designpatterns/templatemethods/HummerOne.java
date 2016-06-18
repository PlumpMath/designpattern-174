package com.designpatterns.templatemethods;

public class HummerOne extends HummerModle {
	private boolean alarmFlag = true;

	@Override
	protected void start() {
		System.out.println("hummerOne start!");
	}

	@Override
	protected void stop() {
		System.out.println("hummerOne stop!");
	}

	@Override
	protected void alarm() {
		System.out.println("hummerOne alarm!");
	}

	@Override
	protected void engineBoom() {
		System.out.println("hummerOne engineBoom!");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	public boolean isAlarmFlag() {
		return alarmFlag;
	}

	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
