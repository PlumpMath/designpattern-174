package com.designpatterns.abstractfactorymethod;

public class FemaleYellowHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("我是女性!");
	}

}
