package com.designpatterns.flyweight;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月7日 上午10:11:13 类说明：Alljava
 */
public abstract class FlyWeight {
	private String intrinsic;

	protected final String extrinsic;

	public FlyWeight(String extrinsic) {
		this.extrinsic = extrinsic;
	}

	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
