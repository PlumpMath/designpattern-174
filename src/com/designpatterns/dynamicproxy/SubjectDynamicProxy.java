package com.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy<T> {
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(Object O) {
		ClassLoader loader = O.getClass().getClassLoader();
		Class<?>[] interfaces = O.getClass().getInterfaces();
		InvocationHandler h = new MyInvocationHandler(O);
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
