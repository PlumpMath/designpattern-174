package com.designpatterns.mediator;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:45:41 类说明：Alljava
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(IMediator mediator) {
		super(mediator);
	}

	public void selfMethod2() {
		System.out.println("this is selfMethod2!");
	}

	public void depMethod2() {
		super.mediator.doSomething2();
	}
}
