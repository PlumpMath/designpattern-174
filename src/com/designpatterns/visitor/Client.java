package com.designpatterns.visitor;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午9:49:20
 * 类说明：Alljava
 */
public class Client {

	public static void main(String[] args) {
		Visitor v =new Visitor();
		ConcreteElement1 element1 = new ConcreteElement1();
		ConcreteElement2 element2 = new ConcreteElement2();
		element1.accept(v);
		element2.accept(v);

	}

}
