package com.designpatterns.decorator;

public class Espresso extends Beverage {

	public Espresso(int i) {
		description = "Espresso";
		flag = i;
	}

	@Override
	public double cost() {
		return 1.99 + this.getFlag(flag);
	}

}
