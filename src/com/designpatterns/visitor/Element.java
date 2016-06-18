package com.designpatterns.visitor;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午9:34:48
 * 类说明：Alljava
 */
public abstract class Element {
	public abstract void doSomething();
	public abstract void accept(IVisitor visitor);
}
