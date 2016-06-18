package com.designpatterns.singleton;

public class SingletonMultiThread{
	private static SingletonMultiThread SINGLETON = null;

	private SingletonMultiThread() {
		
	}
	
	public synchronized static SingletonMultiThread getSingleton(){
		if(SINGLETON==null){
			SINGLETON=new SingletonMultiThread();
		}
		return SINGLETON;
	}

	public void sayHello() {
		System.out.println("I am SingletonLazy!");
		
	}

}
