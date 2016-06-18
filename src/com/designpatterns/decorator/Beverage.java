package com.designpatterns.decorator;

public abstract class Beverage {
	public String description = "Unknown Beverage";
	public int flag = 0;

	
	public String getDescription() {
		return description;
	}
	
	public double getFlag(int flag) {
		if (flag == 0) {
			return 0.10;
		}else if (flag == 1) {
			return 0.15;
		}
		return 0.20;
	}
	
	public abstract double cost();
	
}
