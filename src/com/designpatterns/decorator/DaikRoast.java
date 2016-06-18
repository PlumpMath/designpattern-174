package com.designpatterns.decorator;

public class DaikRoast extends Beverage {

	public DaikRoast(int i) {
		description = "DaikRoast Coffee";
		flag = i;
	}

	@Override
	public double cost() {
		return 1.2 + this.getFlag(flag);
	}

}
