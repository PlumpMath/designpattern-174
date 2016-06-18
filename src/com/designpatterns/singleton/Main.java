package com.designpatterns.singleton;


public class Main {

	public static void main(String[] args) {
		SingletonHungryMode singletonHungry = SingletonHungryMode.getSingleton();
		SingletonLazyMode singletonLazy = SingletonLazyMode.getSingleton();
		singletonHungry.sayHello();
		singletonLazy.sayHello();

	}

}
