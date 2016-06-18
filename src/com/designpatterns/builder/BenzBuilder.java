package com.designpatterns.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	private BenzModle benzModle = new BenzModle();
	@Override
	public void setSequence(ArrayList<String> al) {
		this.benzModle.setAl(al);
	}

	@Override
	public CarModle getCarModle() {
		return this.benzModle;
	}

}
