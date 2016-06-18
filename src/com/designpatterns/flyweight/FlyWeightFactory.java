package com.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午10:20:03 类说明：Alljava
 */
public class FlyWeightFactory {
	private static HashMap<String, FlyWeight> pool = new HashMap<String, FlyWeight>();

	public FlyWeightFactory() {
	}

	public static FlyWeight getFlyWeight(String extrinsic) {
		FlyWeight flyWeight = null;
		if (pool.containsKey(extrinsic)) {
			flyWeight = pool.get(extrinsic);
		} else {
			flyWeight = new ConcreteFlyWeight1(extrinsic);
			pool.put(extrinsic, flyWeight);
		}
		return flyWeight;
	}
}
