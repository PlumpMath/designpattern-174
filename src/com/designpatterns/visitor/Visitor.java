package com.designpatterns.visitor;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午9:48:48
 * 类说明：Alljava
 */
public class Visitor implements IVisitor {

	@Override
	public void visitor(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
	}

	@Override
	public void visitor(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();
	}

}
