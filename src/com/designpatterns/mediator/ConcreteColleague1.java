package com.designpatterns.mediator;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:42:44
 * 类说明：Alljava
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(IMediator mediator) {
		super(mediator);
	}
	public void selfMethod1(){
		System.out.println("this is selfMethod1!");
	}

	public void depMethod1(){
		super.mediator.doSomething1();
	}
}
