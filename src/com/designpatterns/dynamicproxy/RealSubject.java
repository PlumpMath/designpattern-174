package com.designpatterns.dynamicproxy;

public class RealSubject implements Subject {
	@Override
	public void sayHello() {
		System.out.println("hello!");
	}

	@Override
	public void sayByeBye() {
		System.out.println("ByeBye!");
	}
}
