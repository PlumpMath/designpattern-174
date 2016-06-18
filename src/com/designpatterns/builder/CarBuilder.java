package com.designpatterns.builder;

import java.util.ArrayList;

public abstract class CarBuilder {
	public abstract void setSequence(ArrayList<String> al);
	public abstract CarModle getCarModle();
}
