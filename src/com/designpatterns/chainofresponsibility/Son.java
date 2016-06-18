package com.designpatterns.chainofresponsibility;

public class Son extends Handler {

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(Women women) {
		System.out.println("--------------母亲向儿子请示-----------------");
		System.out.println(women.getRequest());
		System.out.println("儿子的回复是：同意");
	}

}
