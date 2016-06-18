package com.designpatterns.facade;

/**
 * @author WSYW126
 * @version 2016年5月6日下午7:19:14
 */
public class Facade {
	ClassA A = new ClassA();
	ClassB B = new ClassB();
	ClassC C = new ClassC();
	
	public void eat(){
		A.doSomething();
		B.doSomething();
		C.doSomething();
	}
}
