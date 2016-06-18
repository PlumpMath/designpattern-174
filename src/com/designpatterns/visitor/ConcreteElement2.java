package com.designpatterns.visitor;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午9:34:48
 * 类说明：Alljava
 */
public class ConcreteElement2 extends Element{

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement2 doSomething!");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitor(this);
	}

}
