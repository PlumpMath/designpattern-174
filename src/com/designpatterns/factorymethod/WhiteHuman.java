package com.designpatterns.factorymethod;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("我是白色皮肤！");
	}

	@Override
	public void talk() {
		System.out.println("我说话，是一个字节！");
	}

}
