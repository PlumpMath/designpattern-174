package com.designpatterns.decorator;

public class Dect extends Beverage {

	public Dect(int i) {
		description = "Dect Coffee";
		flag = i;
	}

	@Override
	public double cost() {
		return 1.5 + this.getFlag(flag);
	}

}
