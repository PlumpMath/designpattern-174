package com.designpatterns.mediator;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:48:04 类说明：Alljava
 */
public class ConcreteMediator extends IMediator {

	public ConcreteMediator() {
	}

	@Override
	public void doSomething1() {
		super.C1.selfMethod1();
		super.C2.selfMethod2();
	}

	@Override
	public void doSomething2() {
		super.C1.selfMethod1();
		super.C2.selfMethod2();
	}

}
