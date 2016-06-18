package com.designpatterns.templatemethods;

public class HummerTwo extends HummerModle {

	@Override
	protected void start() {
		System.out.println("hummerTwo start!");
	}

	@Override
	protected void stop() {
		System.out.println("hummerTwo stop!");
	}

	@Override
	protected void alarm() {
		System.out.println("hummerTwo alarm!");
	}

	@Override
	protected void engineBoom() {
		System.out.println("hummerTwo engineBoom!");
	}
}
