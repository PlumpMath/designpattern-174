package com.designpatterns.singleton;

public class SingletonLazyMode{
	private static SingletonLazyMode SINGLETON = null;

	private SingletonLazyMode() {
		
	}
	
	public static SingletonLazyMode getSingleton(){
		if(SINGLETON==null){
			SINGLETON=new SingletonLazyMode();
		}
		return SINGLETON;
	}

	public void sayHello() {
		System.out.println("I am SingletonLazy!");
		
	}

}
