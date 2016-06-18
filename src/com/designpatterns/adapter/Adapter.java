package com.designpatterns.adapter;
/**
 * @author WSYW126
 * @version 2016年5月4日下午9:28:32
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}
