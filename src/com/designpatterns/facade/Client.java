package com.designpatterns.facade;

/**
 * @author WSYW126
 * @version 2016年5月6日下午7:20:30
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("我要吃饭！");
		Facade F = new Facade();
		F.eat();
	}
}
