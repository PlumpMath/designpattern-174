package com.designpatterns.mulfactorymethod;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("我黑色皮肤！");

	}

	@Override
	public void talk() {
		System.out.println("我说话你听不懂！");

	}

}
