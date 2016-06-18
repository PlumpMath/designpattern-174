package com.designpatterns.mediator;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:51:22 类说明：Alljava
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator cm = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(cm);
		ConcreteColleague2 c2 = new ConcreteColleague2(cm);

		cm.setC1(c1);
		cm.setC2(c2);

		c2.depMethod2();
	}

}
