package com.designpatterns.builder;

import java.util.ArrayList;

public class HummerBuilder extends CarBuilder {

	private HummerModle hummerModle = new HummerModle();
	@Override
	public void setSequence(ArrayList<String> al) {
		this.hummerModle.setAl(al);
	}

	@Override
	public CarModle getCarModle() {
		return this.hummerModle;
	}

}
