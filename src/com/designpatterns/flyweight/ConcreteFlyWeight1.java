package com.designpatterns.flyweight;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午10:16:39
 * 类说明：Alljava
 */
public class ConcreteFlyWeight1 extends FlyWeight {

	public ConcreteFlyWeight1(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("I am ConcreteFlyWeight1! \t\tthe intrinsic is "+super.getIntrinsic());
	}

}
