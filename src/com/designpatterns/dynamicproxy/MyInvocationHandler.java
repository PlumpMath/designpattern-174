package com.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target = null;

	public MyInvocationHandler(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		(new Before()).sayBefore();
		Object o = method.invoke(this.target, args);
		(new After()).sayAfter();
		return o;
	}
}
