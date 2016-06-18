package com.designpatterns.visitor;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午9:36:08
 * 类说明：Alljava
 */
public interface IVisitor {
	public void visitor(ConcreteElement1 concreteElement1);
	public void visitor(ConcreteElement2 concreteElement2);
}
