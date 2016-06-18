package com.designpatterns.mediator;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:33:09
 * 类说明：Alljava
 */
public abstract class IMediator {
protected ConcreteColleague1 C1;
	protected ConcreteColleague2 C2;

	public ConcreteColleague1 getC1() {
		return C1;
	}

	public void setC1(ConcreteColleague1 c1) {
		C1 = c1;
	}

	public ConcreteColleague2 getC2() {
		return C2;
	}

	public void setC2(ConcreteColleague2 c2) {
		C2 = c2;
	}

	public abstract void doSomething1();
	public abstract void doSomething2();
}
