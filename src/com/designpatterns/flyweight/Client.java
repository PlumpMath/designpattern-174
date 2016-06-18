package com.designpatterns.flyweight;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午10:26:36
 * 类说明：Alljava
 */
public class Client {

	public static void main(String[] args) {
		FlyWeight f1 =  FlyWeightFactory.getFlyWeight("this is first!");
		FlyWeight f2 =  FlyWeightFactory.getFlyWeight("this is first!");
		FlyWeight f3 =  FlyWeightFactory.getFlyWeight("this is second!");
		System.out.println(f1==f2);
		System.out.println(f3==f2);
		f1.setIntrinsic("ConcreteFlyWeight1");
		f1.operate();

	}

}
