package com.designpatterns.singleton;

public class SingletonHungryMode {
	private static final SingletonHungryMode SINGLETON = new SingletonHungryMode();

	private SingletonHungryMode() {

	}
	
	public static SingletonHungryMode getSingleton(){
		return SINGLETON;
	}

	public void sayHello() {
		System.out.println("I am SingletonHungry!");
		
	}

}
