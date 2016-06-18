package com.designpatterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend(int i) {
		description = "House Blend Coffee";
		flag = i;
	}

	@Override
	public double cost() {
		return 0.89 + this.getFlag(flag);
	}

}
