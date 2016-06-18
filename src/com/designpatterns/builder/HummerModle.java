package com.designpatterns.builder;

public class HummerModle extends CarModle {

	@Override
	protected void start() {
		System.out.println("hummer start!");
	}

	@Override
	protected void stop() {
		System.out.println("hummer stop!");
	}

	@Override
	protected void alarm() {
		System.out.println("hummer alarm!");
	}

	@Override
	protected void engineBoom() {
		System.out.println("hummer engineBoom!");
	}

}
