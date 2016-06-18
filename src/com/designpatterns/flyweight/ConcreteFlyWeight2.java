package com.designpatterns.flyweight;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午10:17:41
 * 类说明：Alljava
 */
public class ConcreteFlyWeight2 extends FlyWeight {

	public ConcreteFlyWeight2(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("I am ConcreteFlyWeight1! the intrinsic is " +super.getIntrinsic());
	}

}
