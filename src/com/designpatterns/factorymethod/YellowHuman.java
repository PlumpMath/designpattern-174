package com.designpatterns.factorymethod;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("我是黄色皮肤！");
	}

	@Override
	public void talk() {
		System.out.println("我说话，是两个字节！");
	}

}
