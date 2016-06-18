package com.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		RealSubject realSubject= new RealSubject();
		InvocationHandler h = new MyInvocationHandler(realSubject);
		Subject proxy=DynamicProxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), h);
		proxy.sayHello();
		proxy.sayByeBye();
		System.out.println("--------------------------");
		//封装后的代理
		Subject subjectProxy= SubjectDynamicProxy.newProxyInstance(realSubject);
		subjectProxy.sayHello();
		subjectProxy.sayByeBye();
		}
}
