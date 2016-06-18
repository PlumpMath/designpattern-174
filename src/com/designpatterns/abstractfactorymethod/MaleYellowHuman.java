package com.designpatterns.abstractfactorymethod;

public class MaleYellowHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("我是男性!");
	}

}
