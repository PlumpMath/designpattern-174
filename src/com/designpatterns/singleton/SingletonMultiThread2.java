package com.designpatterns.singleton;

public class SingletonMultiThread2{
	private static SingletonMultiThread2 SINGLETON = null;

	private SingletonMultiThread2() {
		
	}
	
	public static SingletonMultiThread2 getSingleton(){
		if(SINGLETON==null){
			//加同步的时候使用的锁是 该类所属的字节码文件对象 
			synchronized(SingletonMultiThread2.class){
				if(SINGLETON==null){
					SINGLETON=new SingletonMultiThread2();
				}
			}
		}
		return SINGLETON;
	}

	public void sayHello() {
		System.out.println("I am SingletonLazy!");
		
	}

}
